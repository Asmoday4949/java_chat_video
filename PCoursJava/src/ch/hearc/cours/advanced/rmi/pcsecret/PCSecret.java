
package ch.hearc.cours.advanced.rmi.pcsecret;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.Date;

import javax.swing.JFrame;

import ch.hearc.cours.advanced.rmi.Settings;
import ch.hearc.cours.advanced.rmi.pchorloge.Horloge_I;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class PCSecret
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private PCSecret()
		{
		JFrame jFrame = null;
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

	public synchronized static PCSecret getInstance()
		{
		if (instance == null)
			{
			instance = new PCSecret();
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
		RmiURL url = new RmiURL(Settings.ID_HORLOGE, Settings.IP_HORLOGE, Settings.PORT_HORLOGE);
		Horloge_I horlogeRemote;
		try
			{
			horlogeRemote = (Horloge_I)RmiTools.connectionRemoteObjectBloquant(url, 1000, 100);
			work(horlogeRemote);
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[PCSecret] : clientSide : Remote error!");
			e.printStackTrace();
			}
		}

	private void work(Horloge_I horlogeRemote)
		{
		try
			{
			HorlogeRemote.init(horlogeRemote);
			HorlogeRemote.getInstance();
			Date date = horlogeRemote.getTime();
			System.out.println(date);
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
			this.secret = Secret.getInstance();
			RmiTools.shareObject(this.secret, new RmiURL(Settings.ID_SECRET, Settings.PORT_SECRET));
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[PSecret] : serverSide() : Impossible de partager l'objet Secret :c");
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private Secret secret;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static PCSecret instance = null;
	}
