
package ch.hearc.cours.tools.gui;

import java.awt.BorderLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class JCentrer extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JCentrer(JComponent jComponent)
		{
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
		jCentrerV = new JCentrerV(jComponent);
		jCentrerH = new JCentrerH(jCentrerV);

		setLayout(new BorderLayout());

		add(jCentrerH, BorderLayout.CENTER);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private JComponent jComponent;

	//Tools
	private JCentrerV jCentrerV;
	private JCentrerH jCentrerH;
	}
