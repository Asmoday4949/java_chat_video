
package ch.hearc.cours.gui.hello.exercicecompteur.strategy2;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelCompteur extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/
	public JPanelCompteur()
		{
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
		jLabel = new JLabel();
		jButtonCompteur = new JButtonCompteur(jLabel);

		add(jLabel);
		add(jButtonCompteur);
		}

	private void control()
		{
		jLabel.setToolTipText("Nombre de clics sur le bouton");
		}

	private void appearence()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JButtonCompteur jButtonCompteur;
	private JLabel jLabel;

	}
