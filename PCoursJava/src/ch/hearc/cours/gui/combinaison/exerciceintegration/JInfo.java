
package ch.hearc.cours.gui.combinaison.exerciceintegration;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JInfo extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JInfo()
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
		jButton1 = new JButton("Info 1");
		jButton2 = new JButton("Info 2");
		jButton3 = new JButton("Info 3");
		jButton4 = new JButton("Info 4");

		layout = new GridLayout(2, -1);
		setLayout(layout);

		add(jButton1);
		add(jButton2);
		add(jButton3);
		add(jButton4);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		layout.setHgap(20);
		layout.setVgap(20);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;

	private GridLayout layout;
	}
