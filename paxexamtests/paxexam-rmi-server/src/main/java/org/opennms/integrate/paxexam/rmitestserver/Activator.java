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
package org.opennms.integrate.paxexam.rmitestserver;

import java.rmi.NoSuchObjectException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URL;
import org.osgi.framework.Bundle;
import org.ops4j.pax.swissbox.framework.RemoteFrameworkImpl;
import org.ops4j.pax.swissbox.tracker.ServiceLookup;

public class Activator implements BundleActivator {
	 private static Logger LOG = LoggerFactory.getLogger(Activator.class);
	 
     private Registry paxexamRmiRegistry=null;
	 
	 //org.ops4j.pax.exam.rbc.rmi.host= localhost
	//		 org.ops4j.pax.exam.rbc.rmi.name= PaxExam
	//		 org.ops4j.pax.exam.rbc.rmi.port= 1099
	 
	 // same as org.ops4j.pax.exam.rbc.Constants
	    public static final String RMI_PORT_PROPERTY = "org.ops4j.pax.exam.rbc.rmi.port";
	    public static final String RMI_HOST_PROPERTY = "org.ops4j.pax.exam.rbc.rmi.host";
	    public static final String RMI_NAME_PROPERTY = "org.ops4j.pax.exam.rbc.rmi.name";

    public void start(BundleContext context) {

    	String portStr = System.getProperty(RMI_PORT_PROPERTY);

        LOG.info("Starting paxexam test RMI server: RMI_PORT_PROPERTY="+portStr);
        
		try {
			Integer port = Integer.valueOf(portStr);
			
			URL location1 = RemoteFrameworkImpl.class.getProtectionDomain().getCodeSource().getLocation();
	        URL location2 = Bundle.class.getProtectionDomain().getCodeSource().getLocation();
	        URL location3 = ServiceLookup.class.getProtectionDomain().getCodeSource().getLocation();
	        String codebase = location1 + " " + location2 + " " + location3 ;
	        LOG.debug("setting java.rmi.server.codebase:" +codebase);
	        System.setProperty( "java.rmi.server.codebase", codebase);

			paxexamRmiRegistry = LocateRegistry.createRegistry(port);
			LOG.debug("new registry Created "+paxexamRmiRegistry );			
			
		} catch (Exception e) {
			LOG.error("problem creating paxexamRmiRegistry port="+portStr, e);
		} 
        
    }

    public void stop(BundleContext context) {
    	LOG.info("Stopping paxexam test RMI server");
    	if(paxexamRmiRegistry != null)
			try {
				UnicastRemoteObject.unexportObject(paxexamRmiRegistry,true);
			} catch (NoSuchObjectException e) {
				LOG.error("problem unexporting paxexamRmiRegistry", e);
			}
    }

}