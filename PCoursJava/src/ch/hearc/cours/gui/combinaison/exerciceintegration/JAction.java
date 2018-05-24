
package ch.hearc.cours.gui.combinaison.exerciceintegration;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class JAction extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JAction()
		{
		super(BoxLayout.X_AXIS);

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
		jButtonbg = new JButton("Action 1");
		jButtonbd = new JButton("Action 2");

		add(jButtonbg);
		add(Box.createHorizontalGlue());
		add(jButtonbd);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jButtonbg;
	private JButton jButtonbd;
	}
