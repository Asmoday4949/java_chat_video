
package ch.hearc.cours.gui.layout.borderlayout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelBorderLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelBorderLayout()
		{
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

		layout = new BorderLayout();
		setLayout(layout);

		add(jbutton1, BorderLayout.SOUTH);
		add(jbutton2, BorderLayout.WEST);
		add(jbutton3, BorderLayout.EAST);
		add(jbutton4, BorderLayout.CENTER);
		add(jbutton5, BorderLayout.NORTH);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		layout.setHgap(25);
		layout.setVgap(50);
		jbutton1.setPreferredSize(new Dimension(-1, 100));
		jbutton3.setPreferredSize(new Dimension(400, -1));
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

	private BorderLayout layout;

	}
