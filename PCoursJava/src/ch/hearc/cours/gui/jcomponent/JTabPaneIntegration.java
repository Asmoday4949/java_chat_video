
package ch.hearc.cours.gui.jcomponent;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class JTabPaneIntegration extends JTabbedPane
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JTabPaneIntegration()
		{
		super(SwingConstants.TOP);

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
		jSplitPaneDemo = new JSplitPaneDemo();
		jOnglet2 = new JPanel();

		this.add("Onglet1", jSplitPaneDemo);
		this.add("Onglet2", jOnglet2);
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
	private JSplitPaneDemo jSplitPaneDemo;
	private JPanel jOnglet2;
	}
