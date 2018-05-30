
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
		Settings.init("localhost");
		Settings settings = Settings.getInstance();

		System.out.println("RMI ADDRESS");
		System.out.println(settings.getRmiAddress());
		System.out.println("RMI ID");
		System.out.println(settings.getRmiID());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
