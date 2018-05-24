
package ch.hearc.cours.gui.combinaison;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import ch.hearc.cours.gui.tools.JDecoratorMarge;

public class JFrameCombinaison extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameCombinaison()
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
		jPanel = new JPanelCombinaison();
		jDecoratorMarge = new JDecoratorMarge(jPanel,40);

		setLayout(new BorderLayout());

		add(jDecoratorMarge, BorderLayout.CENTER);
		}

	private void control()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void appearance()
		{
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JDecoratorMarge jDecoratorMarge;
	private JPanelCombinaison jPanel;

	}
