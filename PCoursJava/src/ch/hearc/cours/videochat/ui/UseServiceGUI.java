
package ch.hearc.cours.videochat.ui;

import javax.swing.UIManager;

import ch.hearc.cours.videochat.network.Settings;

public class UseServiceGUI
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		Settings settings = Settings.getInstance();
		if (args.length > 0)
			{
			Settings.patchLocal(args[0]);
			}
		main();
		}

	public static void main()
		{
		try
			{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
		catch (Exception e)
			{
			e.printStackTrace();
			}
		ServiceGUI.getInstance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
