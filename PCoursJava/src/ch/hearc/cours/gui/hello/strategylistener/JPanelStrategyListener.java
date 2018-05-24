
package ch.hearc.cours.gui.hello.strategylistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelStrategyListener extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelStrategyListener()
		{
		geometry();
		control();
		appearence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jButton1 = new JButton("Strategy Listener 1");
		jButton2 = new JButton("Strategy Listener 2");

		add(jButton1);
		add(jButton2);
		}

	private void control()
		{
		strategy1();
		strategy2();
		strategy3();
		}

	/**
	 * Musée des horreurs
	 * Ce code n'est pas résistant au refactoring et traduction et changement du label du bouton
	 */
	private void strategy3()
		{
		ActionListener actionListener = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				JButton boutonSource = (JButton)e.getSource();
				String boutonSourceText = boutonSource.getText();
				int id = 0;
				if (boutonSourceText.equals("Strategy Listener 1"))
					{
					id = 1;
					}
				else if (boutonSourceText.equals("Strategy Listener 2"))
					{
					id = 2;
					}
				System.out.println("clic bouton " + id + " : Strategy 3");
				}
			};

		jButton1.addActionListener(actionListener);
		jButton2.addActionListener(actionListener);
		}

	private void strategy2()
		{
		ActionListener actionListener = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				JButton boutonSource = (JButton)e.getSource();
				int id = 0;
				if (boutonSource == jButton1)
					{
					id = 1;
					}
				else if (boutonSource == jButton2)
					{
					id = 2;
					}
				System.out.println("clic bouton " + id + " : Strategy 2");
				}
			};

		jButton1.addActionListener(actionListener);
		jButton2.addActionListener(actionListener);
		}

	private void strategy1()
		{
		jButton1.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("clic bouton 1 : Strategy 1");
				}
			});
		jButton2.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("clic bouton 2 : Strategy 1");
				}
			});
		}

	private void appearence()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jButton1;
	private JButton jButton2;

	}
