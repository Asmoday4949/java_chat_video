
package ch.hearc.cours.gui.tools;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class JDecoratorMargeH extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JDecoratorMargeH(JComponent jComponent, int marge)
		{
		this.jComponent = jComponent;
		this.dimension = new Dimension(marge, marge);

		geometry();
		control();
		appearance();
		}

	public JDecoratorMargeH(JComponent jComponent)
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
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();

		BorderLayout borderLayout = new BorderLayout();

		setLayout(borderLayout);

		add(jComponent, BorderLayout.CENTER);
		add(jPanel1, BorderLayout.WEST);
		add(jPanel2, BorderLayout.EAST);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		setSizeConstante(jPanel1, dimension);
		setSizeConstante(jPanel2, dimension);
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static void setSizeConstante(JComponent jComponent, Dimension dimension)
		{
		jComponent.setPreferredSize(dimension);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private Dimension dimension;
	private JComponent jComponent;

	//Tools
	private JPanel jPanel1;
	private JPanel jPanel2;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int MARGE = 50;
	}
