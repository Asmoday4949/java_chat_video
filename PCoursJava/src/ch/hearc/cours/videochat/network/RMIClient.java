
package ch.hearc.cours.videochat.network;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import ch.hearc.cours.videochat.crypt.CryptingFactory;

import com.bilat.tools.reseau.rmi.RmiTools;
import com.bilat.tools.reseau.rmi.RmiURL;

public class RMIClient
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private RMIClient()
		{
		start();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public boolean rebind()
		{
		try
			{
			RmiTools.rebind(ChatRemote.getInstance().getChat(), new RmiURL(Settings.ID_CHAT, Settings.getInstance().getRemote(), Settings.getInstance().getLocalPort()));
			return true;
			}
		catch (RemoteException | MalformedURLException e)
			{
			e.printStackTrace();
			}
		return false;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public synchronized static RMIClient getInstance()
		{
		if (instance == null)
			{
			instance = new RMIClient();
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
		RmiURL url = new RmiURL(Settings.ID_CHAT, Settings.getInstance().getRemote(), Settings.getInstance().getRemotePort());
		Chat_I chatRemote;
		try
			{
			chatRemote = (Chat_I)RmiTools.connectionRemoteObjectBloquant(url, 1000, 100);
			work(chatRemote);
			}
		catch (RemoteException | MalformedURLException e)
			{
			System.err.println("[RMIClient] : clientSide : Remote error!");
			e.printStackTrace();
			}
		}

	private void work(Chat_I chatRemote)
		{
		try
			{
			System.out.println(chatRemote);
			ChatRemote.init(chatRemote);
			ChatRemote.getInstance();
			chatRemote.writePublicKey(CryptingFactory.createAsymmetricCrypting().getPublicKey());
			}
		catch (RemoteException e)
			{
			e.printStackTrace();
			}
		}

	private void serverSide()
		{
		try
			{
			this.chat = Chat.getInstance();
			System.out.println(Settings.getInstance().getLocal());
			RmiTools.shareObject(this.chat, new RmiURL(Settings.ID_CHAT, Settings.getInstance().getLocalPort()));
			}
		catch (RemoteException | MalformedURLException e)
			{
			e.printStackTrace();
			System.err.println("[RMIClient] : serverSide() : Impossible de partager l'objet Chat : c");
			}
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			disconnect();
		}));
		}

	private void disconnect()
		{
		ServiceRMI.getInstance().stopSendWebcam();
		try
			{
			ChatRemote.getInstance().getChat().disconnect();
			}
		catch (RemoteException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private Chat_I chat;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static RMIClient instance = null;
	}
