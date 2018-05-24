
package ch.hearc.cours.advanced.rmi.pcsecret;

import java.rmi.RemoteException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch.hearc.cours.gui.tools.JFrameComponent;

public class UsePCSecret
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		PCSecret.getInstance();
		JFrame jFrame = new JFrameComponent(new JPanel());
		Timer timer = new Timer();
		timer.schedule(new TimerTask()
			{

			@Override
			public void run()
				{
				try
					{
					jFrame.setTitle(HorlogeRemote.getInstance().getHorloge().getTime().toString());
					}
				catch (RemoteException e)
					{
					//Rien
					}
				}
			}, 0, 1000);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
