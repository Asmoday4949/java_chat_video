
package ch.hearc.cours.advanced.thread;

import ch.hearc.cours.advanced.tools.ThreadTools;

public class UseHelloThread
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
		//helloMonoThread();
		helloThreadSepare();

		System.out.println("Fin de main");
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void helloMonoThread()
		{
		System.out.println("Hello World monothread : " + Thread.currentThread().getName());
		}

	private static void helloThreadSepare()
		{
		Runnable runnable = new Runnable()
			{

			@Override
			public void run()
				{
				System.out.println("Hello World thread separe : " + Thread.currentThread().getName());

				ThreadTools.sleep(3000);

				System.out.println("Fin du thread séparé");
				}
			};
		Thread thread = new Thread(runnable);
		thread.setName("HE-ARC Thread"); // pratique debug
		thread.start(); //assynchrone

		System.out.println("Thread lancé, thread courrant continue son travail");
		}

	}
