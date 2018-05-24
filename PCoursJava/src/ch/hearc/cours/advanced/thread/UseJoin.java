
package ch.hearc.cours.advanced.thread;

import ch.hearc.cours.advanced.tools.ThreadTools;

public class UseJoin
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
		Runnable runnable = new Runnable()
			{

			@Override
			public void run()
				{
				System.out.println("Thread separe debut du run : " + Thread.currentThread().getName());
				ThreadTools.sleep(3000);
				System.out.println("Thread separe fin du run : " + Thread.currentThread().getName());
				}
			};
		Thread thread = new Thread(runnable);
		thread.setName("HE-ARC JOIN");
		thread.start(); // assynchrone

		//but attendre que le thread soit fini (Par exemple pour récupérer un résultat)
		try
			{
			System.out.println("Thread HE-ARC en cours  : " + Thread.currentThread().getName());
			thread.join(); // synchrone : bloque le thread courant (ici main)
			System.out.println("Thread HE-ARC fini  : " + Thread.currentThread().getName());
			}
		catch (InterruptedException e)
			{
			e.printStackTrace();
			}

		System.out.println("Thread main fini  : " + Thread.currentThread().getName());
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}

