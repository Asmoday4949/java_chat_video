
package ch.hearc.cours.gui.jcomponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JPanelTutoRadioBoutton extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelTutoRadioBoutton()
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
		jRadioBouttonRouge = new JRadioButton("Rouge");
		jRadioBouttonOrange = new JRadioButton("Orange");
		jRadioBouttonBleu = new JRadioButton("Bleu");

		setLayout(new FlowLayout());

		add(jRadioBouttonBleu);
		add(jRadioBouttonOrange);
		add(jRadioBouttonRouge);
		}

	private void control()
		{
		ButtonGroup boutonGroup = new ButtonGroup();

		boutonGroup.add(jRadioBouttonBleu);
		boutonGroup.add(jRadioBouttonOrange);
		boutonGroup.add(jRadioBouttonRouge);

		//controlV1();
		controlV2();
		}

	private void controlV2()
		{
		ActionListener actionListener = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				JRadioButton source = (JRadioButton)e.getSource();
				if (source == jRadioBouttonBleu)
					{
					System.out.println("Bleu");
					}
				else if (source == jRadioBouttonOrange)
					{
					System.out.println("Orange");
					}
				else
					{
					System.out.println("Rouge");
					}
				}
			};

		jRadioBouttonBleu.addActionListener(actionListener);
		jRadioBouttonOrange.addActionListener(actionListener);
		jRadioBouttonRouge.addActionListener(actionListener);
		}

	private void controlV1()
		{
		jRadioBouttonBleu.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("Bleu");
				}
			});

		jRadioBouttonOrange.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("Orange");
				}
			});

		jRadioBouttonRouge.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				System.out.println("Rouge");
				}
			});
		}

	private void appearance()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JRadioButton jRadioBouttonRouge;
	private JRadioButton jRadioBouttonOrange;
	private JRadioButton jRadioBouttonBleu;
	}
