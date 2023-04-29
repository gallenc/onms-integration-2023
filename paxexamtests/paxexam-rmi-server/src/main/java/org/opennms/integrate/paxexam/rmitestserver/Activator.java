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
			
			paxexamRmiRegistry=LocateRegistry.getRegistry(port);
			if(paxexamRmiRegistry!=null) {
				LOG.info("Paxexam test RMI server already exists on port RMI_PORT_PROPERTY="+portStr);
				return;
			}

			paxexamRmiRegistry = LocateRegistry.createRegistry(port);
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