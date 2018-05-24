
package ch.hearc.cours.gui.hello.jframe.good;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameHelloGood extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameHelloGood()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		//Rien
		}

	private void control()
		{
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Tue la JVM a la fermeture de la derniere fenetre.
		}

	private void appearance()
		{
		setTitle("Hello");
		setSize(300, 600);
		//setLocation(0, 0);
		setLocationRelativeTo(null); // Centre automatiquement la fenetre.
		setVisible(true); //Doit etre la derniere instruction, c'est important !
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/
	}
