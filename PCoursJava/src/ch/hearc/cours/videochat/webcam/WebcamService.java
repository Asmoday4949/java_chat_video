
package ch.hearc.cours.videochat.webcam;

import org.junit.Assert;

import com.github.sarxos.webcam.Webcam;

public class WebcamService
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private WebcamService()
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
	|*				Get				*|
	\*------------------------------*/

	public WebcamImage getImage()
		{
		Assert.assertTrue(this.webcamDevice.isOpen());
		return new WebcamImage(this.webcamDevice.getImage());
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public synchronized static WebcamService getInstance()
		{
		if (instance == null)
			{
			instance = new WebcamService();
			}

		return instance;
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setResolution(WebcamResolution resolution)
		{
		this.webcamDevice.setViewSize(resolution.getDimension());
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
		this.webcamDevice.setCustomViewSizes(WebcamResolution.getAllDimensions());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Webcam webcamDevice;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static WebcamService instance = null;

	}
