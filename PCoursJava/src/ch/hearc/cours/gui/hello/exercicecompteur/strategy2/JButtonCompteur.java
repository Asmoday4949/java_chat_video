
package ch.hearc.cours.gui.hello.exercicecompteur.strategy2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class JButtonCompteur extends JButton
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JButtonCompteur(JLabel jLabel)
		{
		super("Incrementer");
		this.jLabel = jLabel;

		compteur = 0;

		geometry();
		control();
		appearence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		//Rien
		}

	private void control()
		{
		addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				++compteur;
				jLabel.setText("" + compteur);
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

	//Input
	private JLabel jLabel;

	//Tools
	private int compteur;

	}
