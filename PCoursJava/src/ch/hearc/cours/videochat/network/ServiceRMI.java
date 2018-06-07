
package ch.hearc.cours.videochat.network;

import java.io.IOException;
import java.rmi.RemoteException;
import java.security.PublicKey;
import java.util.Timer;
import java.util.TimerTask;

import ch.hearc.cours.videochat.ui.ServiceGUI;
import ch.hearc.cours.videochat.webcam.ServiceWebcam;

public class ServiceRMI
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ServiceRMI()
		{
		Chat.getInstance();
		this.timerWebcamRefresh = new Timer();
		this.timerReconnect = new Timer();
		this.publicKey = null;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void connect(String remoteIP, int remotePort, int localPort)
		{
		Settings.init(remoteIP, remotePort, localPort);

		RMIClient.getInstance();
		ChatRemote.getInstance();
		}

	public void disconnect()
		{
		System.out.println("Client disconnected");

		if (timerReconnect != null)
			{
			timerReconnect.cancel();
			timerReconnect.purge();
			}
		timerReconnect = null;
		}

	public void startSendWebcam()
		{
		if (!ServiceWebcam.getInstance().isOpen()) { return; }

		timerWebcamRefresh.cancel();
		timerWebcamRefresh.purge();
		timerWebcamRefresh = new Timer();
		timerWebcamRefresh.schedule(new TimerTask()
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
					disconnected();
					e.printStackTrace();
					}
				}
			}, REFRESH_MS, REFRESH_MS); //TODO change refresh speed here
		}

	public void stopSendWebcam()
		{
		timerWebcamRefresh.cancel();
		timerWebcamRefresh.purge();
		}

	public void writeMessage(String message)
		{
		try
			{
			ChatRemote.getInstance().getChat().writeMessage(new Message(message));
			}
		catch (RemoteException e)
			{
			disconnected();
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

	private void disconnected()
		{
		stopSendWebcam(); // TODO don't reactivate if it was not
		ServiceGUI.getInstance().disconnected();

		if (timerReconnect != null)
			{
			timerReconnect.cancel();
			timerReconnect.purge();
			}
		timerReconnect = new Timer();
		timerReconnect.scheduleAtFixedRate(new TimerTask()
			{

			@Override
			public void run()
				{
				reconnect();
				}
			}, 500, 500);
		}

	private void reconnect()
		{
		try
			{
			if (Settings.getInstance().getRemote().isReachable(50))
				{
				try
					{
					ChatRemote.getInstance().getChat().ping();
					System.out.println("Ping successful");

					//Success
					timerReconnect.cancel();
					timerReconnect.purge();
					timerReconnect = null;

					ChatRemote.getInstance().getChat().writePublicKey(publicKey);
					startSendWebcam();
					}
				catch (RemoteException e)
					{
					ServiceGUI.getInstance().connectionIssues();
					disconnect();
					e.printStackTrace();
					}
				}
			}
		catch (IOException e)
			{
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private Timer timerWebcamRefresh;
	private Timer timerReconnect;
	private PublicKey publicKey;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static ServiceRMI instance;
	private static final int REFRESH_MS = 1000 / 60; //Taux de raffraichissement -> 60 Hz

	}
