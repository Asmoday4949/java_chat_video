
package ch.hearc.cours.gui.hello.exercicecompteur.strategy1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelCompteur extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/
	public JPanelCompteur()
		{
		compteur = 1;
		geometry();
		control();
		appearence();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jlabel = new JLabel();
		jbutton = new JButton("Incrementer compteur");

		add(jlabel);
		add(jbutton);
		}

	private void control()
		{
		jlabel.setToolTipText("Nombre de clics sur le bouton");
		jbutton.addActionListener(new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent e)
				{
				compteur++;
				jlabel.setText("" + compteur);
				}
			});
		}

	private void appearence()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButton jbutton;
	private JLabel jlabel;
	private int compteur;

	}
