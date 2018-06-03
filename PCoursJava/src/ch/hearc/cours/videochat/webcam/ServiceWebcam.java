
package ch.hearc.cours.videochat.webcam;

import java.util.List;

import org.junit.Assert;

import com.github.sarxos.webcam.Webcam;

public class ServiceWebcam
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ServiceWebcam()
		{
		this.webcamDevice = com.github.sarxos.webcam.Webcam.getDefault();

		this.initWebcamResolution();
		this.setResolution(WebcamResolution.HD);
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
	|*				Get				*|
	\*------------------------------*/

	public WebcamImage getImage()
		{
		if(this.webcamDevice.isOpen())
			{
			return new WebcamImage(this.webcamDevice.getImage());
			}
		else
			{
			return null;
			}
		}

	public List<com.github.sarxos.webcam.Webcam> getListWebcams()
		{
		return com.github.sarxos.webcam.Webcam.getWebcams();
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public synchronized static ServiceWebcam getInstance()
		{
		if (instance == null)
			{
			instance = new ServiceWebcam();
			}

		return instance;
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setResolution(WebcamResolution resolution)
		{
		this.webcamDevice.setViewSize(resolution.getDimension());
		this.resolution = resolution;
		}

	public void setWebcamDevice(com.github.sarxos.webcam.Webcam webcamDevice)
	{
		if(this.isOpen())
			{
			this.close();
			}

		System.out.println(webcamDevice);

		this.webcamDevice = webcamDevice;

		this.initWebcamResolution();
		this.setResolution(this.resolution);

		this.open();
	}

	/*------------------------------*\
	|*				Is				*|
	\*------------------------------*/

	public boolean isOpen()
		{
		return this.webcamDevice.isOpen();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void initWebcamResolution()
		{
		Assert.assertTrue(this.webcamDevice != null);
		this.webcamDevice.setCustomViewSizes(WebcamResolution.getAllDimensions());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Webcam webcamDevice;
	private WebcamResolution resolution;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static ServiceWebcam instance = null;

	}
