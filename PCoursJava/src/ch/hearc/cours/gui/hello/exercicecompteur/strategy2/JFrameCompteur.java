
package ch.hearc.cours.gui.hello.exercicecompteur.strategy2;

import javax.swing.JFrame;

public class JFrameCompteur extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameCompteur()
	{
	geometry();
	control();
	appearence();
	}

	private void geometry()
		{
		jPanelCompteur = new JPanelCompteur();
		add(jPanelCompteur);
		}

	private void control()
		{
		//Rien
		}

	private void appearence()
		{
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
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

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JPanelCompteur jPanelCompteur;

	}

