
package ch.hearc.cours.videochat.ui;

import javax.swing.UIManager;

public class UseServiceGUI
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
		try
			{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}
		catch (Exception e)
			{
			System.out.println(e.getMessage());
			}

		ServiceGUI.getInstance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
