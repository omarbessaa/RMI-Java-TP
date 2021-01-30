package com.obessaa.usthb.tp.gl.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {

	public static void main(String[] args) {
		try {
			// instnaciate the object and create the object server
			ImplementInterface objDemo = new ImplementInterface();
			Registry register = LocateRegistry.createRegistry(1099); // the default port for rmi is 1099
			
			// bind the object to be accessed from the remote client
			register.rebind("RemoteObjDemo", objDemo);
			
		} catch (RemoteException e) {
			System.out.println("Remote Exception");
		}
		
	}

}
