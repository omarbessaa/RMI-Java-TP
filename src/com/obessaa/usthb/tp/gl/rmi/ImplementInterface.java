package com.obessaa.usthb.tp.gl.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImplementInterface extends UnicastRemoteObject implements InterfaceDemo {

	// this is the method to create the object in the server side
	protected ImplementInterface() throws RemoteException {
		super();
		System.out.println("Object created in the server side!");
	}

	// this method method to be called from the remote client, 
	// executed in the server side and send back the results to the remote client
	@Override
	public void getMessage(String msg) throws RemoteException {
		System.out.println("Message from the client : " + msg);
	}

	// same thing as the previous method
	@Override
	public int calculer(int a, int b) throws RemoteException {
		System.out.println("executing the calculer method in the sever side ");
		return a+b;
	}

}
