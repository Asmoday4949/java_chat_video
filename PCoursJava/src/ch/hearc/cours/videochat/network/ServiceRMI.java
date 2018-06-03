
package ch.hearc.cours.videochat.network;

import java.rmi.RemoteException;
import java.security.PublicKey;
import java.util.Timer;
import java.util.TimerTask;

import ch.hearc.cours.videochat.webcam.ServiceWebcam;

public class ServiceRMI
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ServiceRMI()
		{
		Chat.getInstance();
		webcamRefresh = new Timer();
		this.publicKey = null;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void connect(String ip, int port)
		{
		Settings.init(ip);

		RMIClient.getInstance();
		ChatRemote.getInstance();
		}

	public void startSendWebcam()
		{
		//TODO update code here
		if (!ServiceWebcam.getInstance().isOpen()) { return; }

		webcamRefresh.cancel();
		webcamRefresh.purge();
		webcamRefresh = new Timer();
		webcamRefresh.schedule(new TimerTask()
			{

			@Override
			public void run()
				{
				try
					{
					ChatRemote.getInstance().getChat().writeImage(ServiceWebcam.getInstance().getImage());
					}
				catch (RemoteException e)
					{
					e.printStackTrace();
					}
				}
			}, 100, 100); //TODO change refresh speed here
		}

	public void stopSendWebcam()
		{
		webcamRefresh.cancel();
		webcamRefresh.purge();
		}

	public void writeMessage(String message)
		{
		try
			{
			ChatRemote.getInstance().getChat().writeMessage(new Message(message));
			}
		catch (RemoteException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	public void setPublicKey(PublicKey key)
		{
		this.publicKey = key;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public PublicKey getPublicKey()
		{
		return this.publicKey;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static synchronized ServiceRMI getInstance()
		{
		if (instance == null)
			{
			instance = new ServiceRMI();
			}

		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	@Override
	protected void finalize() throws Throwable
		{
		ServiceWebcam.getInstance().close();
		stopSendWebcam();
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Timer webcamRefresh;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static ServiceRMI instance;
	private PublicKey publicKey;

	}
