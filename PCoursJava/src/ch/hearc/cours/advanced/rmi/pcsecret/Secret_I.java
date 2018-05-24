
package ch.hearc.cours.advanced.rmi.pcsecret;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Secret_I extends Remote
	{

	public String getSecret() throws RemoteException;

	}
