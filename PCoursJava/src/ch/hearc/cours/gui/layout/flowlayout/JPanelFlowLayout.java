
package ch.hearc.cours.gui.layout.flowlayout;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelFlowLayout extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelFlowLayout()
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

		layout = new FlowLayout(FlowLayout.CENTER);
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
		layout.setHgap(50);
		layout.setVgap(75);

		jbutton1.setPreferredSize(new Dimension(200, 80));
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

	private FlowLayout layout;

	}
