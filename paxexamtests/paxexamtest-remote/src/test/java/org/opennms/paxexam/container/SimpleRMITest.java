package org.opennms.paxexam.container;

import static org.junit.Assert.*;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SimpleRMITest {

	@Test
	public void test() {
		try {
			//Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			Registry registry = LocateRegistry.getRegistry("localhost", 55555);
			assertNotNull(registry);
			
			System.out.println("registry names:");
			List<String> registryNames = Arrays.asList(registry.list());
			for(String name: registryNames) {
				
				Object obj = registry.lookup(name);
				System.out.println("name: "+name+ "\n obj class: "+obj.getClass().getName()+ "\n obj.toString():  "+obj.toString());
			}
			
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
