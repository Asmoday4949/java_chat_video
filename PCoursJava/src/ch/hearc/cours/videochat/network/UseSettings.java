
package ch.hearc.cours.videochat.network;

import com.bilat.tools.reseau.rmi.RmiTools;

public class UseSettings
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
		Settings settings = Settings.getInstance();
		Settings.init("157.26.105.136", RmiTools.PORT_RMI_DEFAUT, RmiTools.PORT_RMI_DEFAUT);
		try
			{
			System.out.println(settings.getLocal());
			System.out.println(settings.getRemote());
			}
		catch (IndexOutOfBoundsException e)
			{
			e.printStackTrace();
			}

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
