
package ch.hearc.cours.gui.hello.boutoncentrer;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import ch.hearc.cours.gui.tools.JCentrer;

public class JPanelBoutonCentrer extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelBoutonCentrer()
		{
		geometry();
		control();
		appareance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jBouton = new JButton("Bouton");
		jCentrer = new JCentrer(jBouton);

		setLayout(new BorderLayout());
		add(jCentrer, BorderLayout.CENTER);
		}

	private void control()
		{
		//Rien
		}

	private void appareance()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private JCentrer jCentrer;
	private JButton jBouton;

	}
