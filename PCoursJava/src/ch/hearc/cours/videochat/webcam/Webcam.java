
package ch.hearc.cours.videochat.webcam;

import java.awt.image.BufferedImage;

public class Webcam implements Webcam_I
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/
	private Webcam()
		{
		this.webcamDevice = com.github.sarxos.webcam.Webcam.getDefault();
		this.initWebcamResolution();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void open()
	{
	this.webcamDevice.open();
	}

	public void close()
	{
	this.webcamDevice.close();
	}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private void initWebcamResolution()
		{
		this.webcamDevice.setCustomViewSizes(WebcamResolution.getAllDimensions());
		}

	public synchronized static Webcam getInstance()
		{
		if (instance == null)
			{
			instance = new Webcam();
			}

		return instance;
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	@Override
	public void setResolution(WebcamResolution resolution)
		{
		this.webcamDevice.setViewSize(resolution.getDimension());
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public BufferedImage getImage()
		{
		if (this.webcamDevice.isOpen())
			{
			return this.webcamDevice.getImage();
			}
		else
			{
			return null;
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	private com.github.sarxos.webcam.Webcam webcamDevice;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Webcam instance = null;
	}
