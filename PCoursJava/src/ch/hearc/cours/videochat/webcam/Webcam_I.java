
package ch.hearc.cours.videochat.webcam;

import java.awt.image.BufferedImage;
import java.rmi.Remote;


public interface Webcam_I extends Remote
	{
	public BufferedImage getImage();

	public void setResolution(WebcamResolution dimension);
	}

