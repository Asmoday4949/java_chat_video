
package ch.hearc.cours.videochat.webcam;

import com.github.sarxos.webcam.Webcam;

public class WebcamService
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private WebcamService()
		{
		this.webcamDevice = com.github.sarxos.webcam.Webcam.getDefault();
		this.image = new WebcamImage();

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
		this.setWebcamImage();
		return this.image;
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

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void initWebcamResolution()
		{
		this.webcamDevice.setCustomViewSizes(WebcamResolution.getAllDimensions());
		}

	private void setWebcamImage()
		{
		this.image.setImage(this.webcamDevice.getImage());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Webcam webcamDevice;
	private WebcamImage image;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static WebcamService instance = null;

	}
