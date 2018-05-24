
package ch.hearc.cours.gui.hello.boutondansbouton;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelBouton extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelBouton()
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

		jBoutonExt = new JButton("Externe");
		jBoutonInt = new JButton("Interne");

		this.add(jBoutonExt);
		jBoutonExt.add(jBoutonInt, 0);

		}

	private void control()
		{

		ActionListener action = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				JButton boutonSource = (JButton)e.getSource();
				if (boutonSource == jBoutonExt)
					{
					System.out.println("Ola ! Je suis le bouton externe ! :)");
					}
				else
					{
					System.out.println("Ola ! Je suis le bouton interne ! :D");
					}
				}
			};

		jBoutonExt.addActionListener(action);
		jBoutonInt.addActionListener(action);
		}

	private void appearance()
		{
		jBoutonExt.setPreferredSize(new Dimension(200, 200));
		jBoutonInt.setPreferredSize(new Dimension(100, 100));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jBoutonExt;
	private JButton jBoutonInt;

	}
