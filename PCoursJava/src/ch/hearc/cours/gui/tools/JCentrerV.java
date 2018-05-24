
package ch.hearc.cours.gui.tools;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;

public class JCentrerV extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JCentrerV(JComponent jComponent)
		{
		super(BoxLayout.Y_AXIS);
		this.jComponent = jComponent;

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

	private void appearance()
		{
		//Rien
		}

	private void control()
		{
		//Rien
		}

	private void geometry()
		{
		add(Box.createVerticalGlue());
		add(jComponent);
		add(Box.createVerticalGlue());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private JComponent jComponent;
	}
