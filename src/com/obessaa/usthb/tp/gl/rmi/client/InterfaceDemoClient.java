package com.obessaa.usthb.tp.gl.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

interface InterfaceDemoClient extends Remote {
	public void getMessage(String msg) throws RemoteException;
	public int calculer(int a, int b) throws RemoteException;
}
