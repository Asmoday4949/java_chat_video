
package ch.hearc.cours.gui.jcomponent;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import ch.hearc.cours.gui.tools.JDecoratorMarge;

public class JPanelCombinaisonComponent extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelCombinaisonComponent()
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
		setLayout(new BorderLayout());

		jTabPane = new JTabPaneIntegration();

		add(new JDecoratorMarge(jTabPane, 20), BorderLayout.CENTER);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JTabPaneIntegration jTabPane;
	}
