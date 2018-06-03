
package ch.hearc.cours.videochat.webcam;

import java.awt.image.BufferedImage;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface WebcamImage_I extends Remote
	{

	public BufferedImage getImage() throws RemoteException;

	}
