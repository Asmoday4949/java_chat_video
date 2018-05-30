package ch.hearc.cours.videochat.network.client;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import ch.hearc.cours.videochat.network.Settings;
import ch.hearc.cours.videochat.webcam.Webcam;
import ch.hearc.cours.videochat.webcam.WebcamRemote;
import ch.hearc.cours.videochat.webcam.Webcam_I;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class PCClient {

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private PCClient()
		{
		start();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public synchronized static PCClient getInstance()
		{
		if (instance == null)
			{
			instance = new PCClient();
			}

		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void start()
		{
		serverSide();
		clientSide();
		}

	private void clientSide()
		{
		RmiURL url = new RmiURL(Settings.ID_SERVER, Settings.IP_SERVER, Settings.PORT_SERVER);
		Webcam_I webcamRemote;
		try
			{
			webcamRemote = (Webcam_I)RmiTools.connectionRemoteObjectBloquant(url, 1000, 100);
			work(webcamRemote);
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[PCClient] : clientSide : Remote error!");
			e.printStackTrace();
			}
		}

	private void work(Webcam_I webcamRemote)
		{
		try
			{
			System.out.println(webcamRemote.getImage());
			WebcamRemote.init(webcamRemote);
			WebcamRemote.getInstance();
			}
		catch (RemoteException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

	private void serverSide()
		{
		try
			{
			this.webcam = Webcam.getInstance();
			RmiTools.shareObject(this.webcam, new RmiURL(Settings.ID_CLIENT, Settings.PORT_CLIENT));
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[PCClient] : serverSide() : Impossible de partager l'objet Webcam : w");
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private Webcam webcam;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static PCClient instance = null;
}
