
package ch.hearc.cours.gui.hello.jframe.horreur;

import javax.swing.JFrame;

public class UseGUIHorreur
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
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setLocation(50, 50);
		frame.setTitle("Hello horreur");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int i = 0;
		while(i < Integer.MAX_VALUE / 1000)
			{
			System.out.println(Thread.currentThread().getName() + " : " + i++);
			}
		System.out.println("Fin main");
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}
