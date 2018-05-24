
package ch.hearc.cours.gui.combinaison.exerciceintegration;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JControl extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JControl()
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
		jButtonbA = new JButton("Control 1");
		jButtonbB = new JButton("Control 2");

		layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);

		add(jButtonbA);
		add(jButtonbB);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		layout.setHgap(20);
		layout.setVgap(20);
		setOpaque(true);

		jButtonbA.setPreferredSize(new Dimension(jButtonbA.getPreferredSize().width, 80));
		jButtonbB.setPreferredSize(new Dimension(jButtonbB.getPreferredSize().width, 80));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private FlowLayout layout;

	private JButton jButtonbA;
	private JButton jButtonbB;
	}
