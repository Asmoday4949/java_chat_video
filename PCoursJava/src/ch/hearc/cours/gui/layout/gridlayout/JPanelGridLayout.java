
package ch.hearc.cours.gui.layout.gridlayout;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelGridLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelGridLayout()
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

		layout = new GridLayout(2, -1);// -1 implique un calcul automatique du nombre de colonnes necessaire
		setLayout(layout);

		add(jbutton1);
		add(jbutton2);
		add(jbutton3);
		add(jbutton4);
		add(jbutton5);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		layout.setHgap(25);
		layout.setVgap(50);

		jbutton1.setMinimumSize(new Dimension(-1, -1));
		jbutton1.setMaximumSize(new Dimension(-1, -1));
		jbutton1.setPreferredSize(new Dimension(-1, -1));
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

	private GridLayout layout;

	}
