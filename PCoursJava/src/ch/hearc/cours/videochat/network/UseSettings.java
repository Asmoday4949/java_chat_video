
package ch.hearc.cours.videochat.network;

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
		Settings.initRemote("157.26.105.136");
		try
			{
			System.out.println(settings.getLocal());
			System.out.println(settings.getRemote());
			}
		catch (IndexOutOfBoundsException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
