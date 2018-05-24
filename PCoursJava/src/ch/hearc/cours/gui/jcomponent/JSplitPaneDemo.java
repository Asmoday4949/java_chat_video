
package ch.hearc.cours.gui.jcomponent;

import javax.swing.JSplitPane;

import ch.hearc.cours.gui.tools.JDecoratorMarge;

public class JSplitPaneDemo extends JSplitPane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JSplitPaneDemo()
		{
		super(JSplitPane.HORIZONTAL_SPLIT);

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
		jPanelTutoRadioBoutton = new JPanelTutoRadioBoutton();
		jPanelCheckbox = new JPanelTutoCheckBox();

		add(new JDecoratorMarge(jPanelCheckbox));
		add(new JDecoratorMarge(jPanelTutoRadioBoutton));
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		this.setOneTouchExpandable(true); //Permet de voir les flèches sur la barre du split
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JPanelTutoCheckBox jPanelCheckbox;
	private JPanelTutoRadioBoutton jPanelTutoRadioBoutton;
	}
