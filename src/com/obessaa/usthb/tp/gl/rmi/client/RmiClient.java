package com.obessaa.usthb.tp.gl.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.obessaa.usthb.tp.gl.rmi.InterfaceDemo;

public class RmiClient {

	public static void main(String[] args) {
		
		try {
			/*
			// consume the obj remotly -- we should do the type cast 
			// because the server send an object of type remote
			// in the uri we use the name defined in the server side to request the service
			// if the port is the 1099th we can remove it from the uri because it's the default port for the rmi applications
			InterfaceDemoClient remoteService = (InterfaceDemoClient) Naming.lookup("rmi://localhost:1099/RemoteObjDemo");
			
			// then we can use the remote object in server as if it was a normal object created in the client side
			System.out.println("invocation of the method calculate fom the client side and getting result : " + remoteService.calculer(2, 1) );
			*/
			
			Registry regClient = LocateRegistry.getRegistry("localhost", 1099);
			InterfaceDemo i = (InterfaceDemo) regClient.lookup("RemoteObjDemo");
			System.out.println("invocation of the method calculate fom the client side and getting result : " + i.calculer(2, 1) );
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
