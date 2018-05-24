
package ch.hearc.cours.gui.hello.jpanel;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class JFrameJPanel extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameJPanel()
		{
		geometry();
		control();
		appearence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jPanelHello = new JPanelHello();
		add(jPanelHello); //Syntaxe simplifie (light)
		//getContentPane().add(jPanelHello); //Syntaxe normal
		}

	private void control()
		{
		//setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		this.addWindowListener(new WindowAdapter()
			{
			@Override
			public void windowClosing(WindowEvent e)
				{
				System.out.println("Fenetre ferme");
				System.exit(0);
				}
			});
		}

	private void appearence()
		{
		getContentPane().setBackground(Color.MAGENTA);
		setSize(234, 234);
		setLocationRelativeTo(null);
		setVisible(true);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JPanelHello jPanelHello;
	}
