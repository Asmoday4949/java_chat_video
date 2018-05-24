
package ch.hearc.cours.gui.tools;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class JDecoratorMargeV extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JDecoratorMargeV(JComponent jComponent, int marge)
		{
		this.jComponent = jComponent;
		this.marge = marge;

		geometry();
		control();
		appearance();
		}

	public JDecoratorMargeV(JComponent jComponent)
		{
		this(jComponent, MARGE);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		box1 = Box.createVerticalBox();
		box2 = Box.createVerticalBox();
		Component marge1 = Box.createVerticalStrut(marge);
		Component marge2 = Box.createVerticalStrut(marge);

		box1.add(marge1);
		box2.add(marge2);

		BorderLayout borderLayout = new BorderLayout();

		setLayout(borderLayout);

		add(jComponent, BorderLayout.CENTER);

		add(box1, BorderLayout.NORTH);
		add(box2, BorderLayout.SOUTH);
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

	//Input
	private JComponent jComponent;
	private int marge;

	//Tools
	//private JPanel jPanel1;
	//private JPanel jPanel2;
	private Box box1;
	private Box box2;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int MARGE = 50;

	}
