
package ch.hearc.cours.gui.jcomponent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class JPanelTutoCheckBox extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelTutoCheckBox()
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
		jCheckBoxLumiere = new JCheckBox("Lumiere");
		jCheckBoxChauffage = new JCheckBox("Chauffage");

		setLayout(new FlowLayout());

		add(jCheckBoxLumiere);
		add(jCheckBoxChauffage);
		}

	private void control()
		{
		jCheckBoxLumiere.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				if (jCheckBoxLumiere.isSelected())
					{
					System.out.println("Lumière ON");
					}
				else
					{
					System.out.println("Lumière OFF");
					}
				}
			});

		jCheckBoxChauffage.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				if (jCheckBoxChauffage.isSelected())
					{
					System.out.println("Chauffage ON");
					}
				else
					{
					System.out.println("Chauffage OFF");
					}
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
	private JCheckBox jCheckBoxLumiere;
	private JCheckBox jCheckBoxChauffage;

	}
