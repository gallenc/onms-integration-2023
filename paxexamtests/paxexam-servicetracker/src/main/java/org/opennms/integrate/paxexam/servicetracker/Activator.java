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
//import org.ops4j.pax.exam.ProbeInvoker;

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

					running.set(true);
					try {
						while (running.get()) {

							LOG.info("tracking services with filter: " + filterStr);
							Filter filter = bundleContext.createFilter(filterStr);
							ServiceTracker tracker = new ServiceTracker(bundleContext, filter, null);
							tracker.open(true);
							try {
								String msg = "";
								tracker.waitForService(10000);
								ServiceReference[] serviceReferences = tracker.getServiceReferences();
								if (serviceReferences == null) {
									msg = msg + "no services found by tracker";
								} else {
									msg = "found "+serviceReferences.length	+ " service references:\n";
									for (ServiceReference ref : serviceReferences) {
										msg = msg + "   " + ref.toString()+"\n";
										for (String propkey: ref.getPropertyKeys()) {
											msg=msg+"     property "+propkey+" = "+ref.getProperty(propkey)+"\n";
										};
									}
								}
								LOG.info(msg.toString());
							} catch (InterruptedException e) {
								throw new RuntimeException("interrupted!", e);
							} finally {
								tracker.close();
							}

						}
						LOG.info("Stopped paxexam service tracker");

					} catch (Exception ex) {
						LOG.info("OpenNMSServiceTracker shutting down on exception", ex);

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