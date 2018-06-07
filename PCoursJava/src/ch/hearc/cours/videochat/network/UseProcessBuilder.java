
package ch.hearc.cours.videochat.network;

import java.io.IOException;
import java.io.InputStream;

public class UseProcessBuilder
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
			ProcessBuilder processBuilder = new ProcessBuilder("ping " + Settings.getInstance().getRemote().getHostAddress());
			Process process = processBuilder.start();
			InputStream IS = process.getErrorStream();
			process = processBuilder.start();

			}
		catch (IOException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
