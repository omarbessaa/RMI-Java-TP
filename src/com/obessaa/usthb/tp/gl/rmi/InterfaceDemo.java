package com.obessaa.usthb.tp.gl.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceDemo extends Remote {
	public void getMessage(String msg) throws RemoteException;
	public int calculer(int a, int b) throws RemoteException;
}
