
package ch.hearc.cours.videochat.network;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.security.PublicKey;

import ch.hearc.cours.videochat.webcam.WebcamImage;

public interface Chat_I extends Remote
	{

	public void writeImage(WebcamImage webcamImage) throws RemoteException;

	public void writeMessage(Message message) throws RemoteException;

	public void writePublicKey(PublicKey key) throws RemoteException;

	public void ping() throws RemoteException;

	}
