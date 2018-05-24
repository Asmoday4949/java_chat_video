
package ch.hearc.cours.gui.combinaison.exerciceintegration;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import ch.hearc.cours.gui.tools.JDecoratorMarge;

public class JGlobal extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JGlobal()
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
		jControl = new JControl();
		jInfo = new JInfo();
		jAction = new JAction();

		jDecoratorMargeActionInt = new JDecoratorMarge(jAction);
		jDecoratorMargeActionExt = new JDecoratorMarge(jDecoratorMargeActionInt);
		jDecoratorMargeInfo = new JDecoratorMarge(jInfo);

		setLayout(new BorderLayout());

		add(jControl, BorderLayout.NORTH);
		add(jDecoratorMargeInfo, BorderLayout.CENTER);
		add(jDecoratorMargeActionExt, BorderLayout.SOUTH);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		jDecoratorMargeActionInt.setBorder(BorderFactory.createTitledBorder("Action"));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JControl jControl;
	private JInfo jInfo;
	private JAction jAction;

	private JDecoratorMarge jDecoratorMargeActionExt;
	private JDecoratorMarge jDecoratorMargeActionInt;
	private JDecoratorMarge jDecoratorMargeInfo;
	}
