/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.opennms.integrate.paxexam.servicetracker;

import java.rmi.NoSuchObjectException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;

import java.net.URL;
import org.osgi.framework.Bundle;
import org.ops4j.pax.swissbox.framework.RemoteFrameworkImpl;
import org.ops4j.pax.swissbox.tracker.ServiceLookup;
import java.util.concurrent.atomic.AtomicBoolean;

import org.ops4j.pax.exam.ProbeInvoker;

import java.io.StringWriter;
import java.io.PrintWriter;

import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator {
	private static Logger LOG = LoggerFactory.getLogger(Activator.class);

	Thread thread = null;
	AtomicBoolean running = new AtomicBoolean(false);

	// org.ops4j.pax.exam.rbc.rmi.host= localhost
	// org.ops4j.pax.exam.rbc.rmi.name= PaxExam
	// org.ops4j.pax.exam.rbc.rmi.port= 1099

	// same as org.ops4j.pax.exam.rbc.Constants
	public static final String RMI_PORT_PROPERTY = "org.ops4j.pax.exam.rbc.rmi.port";
	public static final String RMI_HOST_PROPERTY = "org.ops4j.pax.exam.rbc.rmi.host";
	public static final String RMI_NAME_PROPERTY = "org.ops4j.pax.exam.rbc.rmi.name";

	public void start(BundleContext bundleContext) {

		// String portStr = System.getProperty(RMI_PORT_PROPERTY);
		String filterStr = "(objectClass=org.ops4j.pax.exam.ProbeInvoker)";

		LOG.info("Starting paxexam service tracker");
		if (thread == null) {
			thread = new Thread("OpenNMSServiceTracker") {
				@Override
				public void run() {

					ServiceTracker tracker = null;
					running.set(true);
					try {
						LOG.info("tracking services with filter: " + filterStr);
						Filter filter = bundleContext.createFilter(filterStr);
						tracker = new ServiceTracker(bundleContext, filter, null);
						int trackingCount = tracker.getTrackingCount();

						tracker.open(true);

						while (running.get()) {
							try {
								String msg = "";

								try {
									tracker.waitForService(10000);
								} catch (InterruptedException e) {
									LOG.debug("tracker timeout while waiting for service filter: " + filterStr);
								}

								// only increments on change of services being tracked
								int newTrackingCount = tracker.getTrackingCount();

								if (trackingCount != newTrackingCount) {
									trackingCount = newTrackingCount;

									ServiceReference[] serviceReferences = tracker.getServiceReferences();
									if (serviceReferences == null) {
										msg = msg + "no services found by tracker - waiting for new services filter: "
												+ filterStr;
									} else {
										msg = "found " + serviceReferences.length + " service references:\n";
										for (ServiceReference ref : serviceReferences) {
											msg = msg + "  ref:  " + ref.toString() + "\n";
											for (String propkey : ref.getPropertyKeys()) {
												msg = msg + "     property " + propkey + " = "
														+ ref.getProperty(propkey) + "\n";
											}
											msg = msg + "  property objectClass[] = ";

											String[] objectClass = (String[]) ref.getProperty("objectClass");
											if (objectClass != null) {
												for (String objClassStr : objectClass) {
													msg = msg + objClassStr + " ";
												}
											}

											Object service = bundleContext.getService(ref);
											msg = msg + "\n     bundleContext sevice from ref = " + service + " \n";


											// now try retreiving object using the probe signature
											String probeSignature = (String) ref.getProperty("Probe-Signature");

											String filterExpression =
											 "(&(objectClass=org.ops4j.pax.exam.ProbeInvoker)(Probe-Signature=" + probeSignature + "))";

											//String filterExpression = "(Probe-Signature=" + probeSignature + ")";

											msg = msg + "now try tracking with new filter=" + filterExpression + "\n";
											Filter filter2 = bundleContext.createFilter(filterExpression);
											ServiceTracker tracker2 = new ServiceTracker(bundleContext, filter2, null);
											try {
												tracker2.open(true);
												tracker2.waitForService(10000);
											} catch (InterruptedException e) {
												LOG.debug("tracker2 timeout while waiting for service filter: "
														+ filterExpression);
											}
											ServiceReference ref2 = tracker2.getServiceReference();
											msg = msg + "   reference found using service filter: " + ref2 + "\n";

											ServiceReference[] ref2array = tracker2.getServiceReferences();
											if (ref2array == null) {
												msg = msg + "   ref2array no services being tracked\n";
											} else {
												msg = msg + "   ref2array contains " + ref2array.length
														+ " references: \n";
												for (ServiceReference refn : ref2array) {
													msg = msg + "   ref2array service references: " + refn + "\n";
												}
											}

											tracker2.close();

											Object service2 = null;
											if (ref2 != null) {
												service2 = bundleContext.getService(ref2);
											}
											msg = msg + "   Service object2 = " + service2 + " \n";
											
											// try to invoke the service
											msg = msg + "   try to invoke Service object2 = " + service2 + " \n";
											try {
												ProbeInvoker probeInvoker = (ProbeInvoker) service2;
												probeInvoker.call();
											} catch (Exception ex) {
												StringWriter sw = new StringWriter();
												PrintWriter pw = new PrintWriter(sw);
												ex.printStackTrace(pw);
												msg = msg + "  problem calling service object from ref=" + service2+ " "+sw.toString()+ " \n";
											}

										}
									}
									LOG.info(msg.toString());

									// sleep slows down loop waiting on services
									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										LOG.debug("tracker waiting in loop for service change");
									}

								}

							} catch (Exception ex) {
								LOG.info("OpenNMSServiceTracker exception: ", ex);
							}
						}

					} catch (Exception ex) {
						LOG.info("OpenNMSServiceTracker shutting down on exception: ", ex);

					} finally {
						if (tracker != null)
							tracker.close();
					}

				}
			};
			thread.start();
			LOG.info("Started paxexam service tracker");
		}
	}

	public void stop(BundleContext context) {
		LOG.info("stopping paxexam servicetracker");
		running.set(false);
		if (thread != null)
			synchronized (this) {
				if (thread != null)
					thread.interrupt();
			}
	}

}