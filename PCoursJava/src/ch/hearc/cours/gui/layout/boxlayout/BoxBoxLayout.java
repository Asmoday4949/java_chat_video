
package ch.hearc.cours.gui.layout.boxlayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class BoxBoxLayout extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public BoxBoxLayout()
		{
		super(BoxLayout.Y_AXIS); //Box vertical

		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jbutton1 = new JButton("Button 1");
		jbutton2 = new JButton("Button 2");
		jbutton3 = new JButton("Button 3");
		jbutton4 = new JButton("Button 4");
		jbutton5 = new JButton("Knufagulagenmachate schlagebleide 5");

		add(jbutton1);
		add(Box.createVerticalStrut(20));
		add(jbutton2);
		add(Box.createVerticalGlue());
		add(jbutton3);
		add(Box.createVerticalGlue());
		add(Box.createVerticalGlue());
		add(jbutton4);
		add(Box.createVerticalStrut(20));
		add(jbutton5);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jbutton1;
	private JButton jbutton2;
	private JButton jbutton3;
	private JButton jbutton4;
	private JButton jbutton5;

	}
