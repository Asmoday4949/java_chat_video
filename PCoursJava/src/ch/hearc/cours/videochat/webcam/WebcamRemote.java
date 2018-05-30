
package ch.hearc.cours.videochat.webcam;

import org.junit.Assert;

public class WebcamRemote
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private WebcamRemote()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Webcam_I getWebcam()
		{
		return webcamRemote;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	/**
	 * A appeler une seule fois et avant le getInstance!!!
	 */
	public synchronized static void init(Webcam_I webcamRemote)
		{
		Assert.assertTrue(instance == null);
		WebcamRemote.webcamRemote = webcamRemote;
		}

	/**
	 * A appeler exactement une fois INIT avant
	 */
	public synchronized static WebcamRemote getInstance()
		{
		if (instance == null)
			{
			Assert.assertTrue(webcamRemote != null);
			instance = new WebcamRemote();
			}
		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Webcam_I webcamRemote;
	private static WebcamRemote instance = null;

	}
