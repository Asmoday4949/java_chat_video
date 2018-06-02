
package ch.hearc.cours.videochat.network;

import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;

import ch.hearc.cours.videochat.webcam.WebcamService;

public class ServiceRMI
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ServiceRMI()
		{
		Chat.getInstance();
		webcamRefresh = new Timer();
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
					ChatRemote.getInstance().getChat().writeImage(WebcamService.getInstance().getImage());
					}
				catch (RemoteException e)
					{
					e.printStackTrace();
					}
				}
			}, 500, 500);
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

	/*------------------------------*\
	|*				Get				*|
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

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Timer webcamRefresh;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static ServiceRMI instance;

	}
