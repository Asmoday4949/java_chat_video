
package ch.hearc.cours.advanced.tools;



public class ThreadTools
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void sleep(long delayMs)
	{
		try
			{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(delayMs);
			}
		catch (InterruptedException e)
			{
			System.err.println(Thread.currentThread().getName());
			e.printStackTrace();
			}
	}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/


	}

