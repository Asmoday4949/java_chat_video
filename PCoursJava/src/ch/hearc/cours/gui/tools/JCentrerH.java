
package ch.hearc.cours.gui.tools;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;

public class JCentrerH extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JCentrerH(JComponent jComponent)
		{
		super(BoxLayout.X_AXIS);
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
		add(Box.createHorizontalGlue());
		add(jComponent);
		add(Box.createHorizontalGlue());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private JComponent jComponent;

	}
