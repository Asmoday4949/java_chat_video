
package ch.hearc.cours.advanced.rmi.pchorloge;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import ch.hearc.cours.advanced.rmi.Settings;
import ch.hearc.cours.advanced.rmi.pcsecret.Secret_I;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class PCHorloge
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private PCHorloge()
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

	public synchronized static PCHorloge getInstance()
		{
		if (instance == null)
			{
			instance = new PCHorloge();
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
		RmiURL url = new RmiURL(Settings.ID_SECRET, Settings.IP_SECRET, Settings.PORT_SECRET);
		Secret_I secretRemote;
		try
			{
			secretRemote = (Secret_I)RmiTools.connectionRemoteObjectBloquant(url, 1000, 100);
			work(secretRemote);
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[PCHorloge] : clientSide : Remote error!");
			e.printStackTrace();
			}
		}

	private void work(Secret_I secretRemote)
		{
		try
			{
			System.out.println(secretRemote.getSecret());
			SecretRemote.init(secretRemote);
			SecretRemote.getInstance();
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
			this.horloge = Horloge.getInstance();
			RmiTools.shareObject(this.horloge, new RmiURL(Settings.ID_HORLOGE, Settings.PORT_HORLOGE));
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[PCHorloge] : serverSide() : Impossible de partager l'objet Horloge :c");
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private Horloge horloge;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static PCHorloge instance = null;
	}
