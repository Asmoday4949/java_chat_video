
package ch.hearc.cours.gui.combinaison;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import ch.hearc.cours.gui.hello.boutoncentrer.JPanelBoutonCentrer;
import ch.hearc.cours.gui.hello.exercicecompteur.strategy2.JPanelCompteur;
import ch.hearc.cours.gui.hello.exercicesanslayout.JPanelSansLayout;
import ch.hearc.cours.gui.hello.jpanel.JPanelHello;
import ch.hearc.cours.gui.layout.borderlayout.JPanelBorderLayout;
import ch.hearc.cours.gui.layout.boxlayout.BoxBoxLayout;
import ch.hearc.cours.gui.layout.flowlayout.JPanelFlowLayout;
import ch.hearc.cours.gui.layout.gridlayout.JPanelGridLayout;
import ch.hearc.cours.gui.tools.JDecoratorMarge;

public class JPanelCombinaison extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JPanelCombinaison()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jBorderLayout = new JPanelBorderLayout();
		jFlowLayout = new JPanelFlowLayout();
		jSansLayout = new JPanelSansLayout();
		jGridLayout = new JPanelGridLayout();
		jCompteur = new JPanelCompteur();
		jHello = new JPanelHello();
		jBoxLayout = new BoxBoxLayout();
		jBoutonCentrer = new JPanelBoutonCentrer();

		jDecoratorMargeBorderLayout = new JDecoratorMarge(jBorderLayout, MARGE);
		jDecoratorMargeFlowLayout = new JDecoratorMarge(jFlowLayout, MARGE);
		jDecoratorMargeSansLayout = new JDecoratorMarge(jSansLayout, MARGE);
		jDecoratorMargeGridLayout = new JDecoratorMarge(jGridLayout, MARGE);
		jDecoratorMargeCompteur = new JDecoratorMarge(jCompteur, MARGE);
		jDecoratorMargeHello = new JDecoratorMarge(jHello, MARGE);
		jDecoratorMargeBoxLayout = new JDecoratorMarge(jBoxLayout, MARGE);
		jDecoratorMargeBoutonCentrer = new JDecoratorMarge(jBoutonCentrer, MARGE);

		layout = new GridLayout(3, -1);
		this.setLayout(layout);

		this.add(jDecoratorMargeBorderLayout);
		this.add(jDecoratorMargeFlowLayout);
		this.add(jDecoratorMargeSansLayout);
		this.add(jDecoratorMargeGridLayout);
		this.add(jDecoratorMargeCompteur);
		this.add(jDecoratorMargeHello);
		this.add(jDecoratorMargeBoxLayout);
		this.add(jDecoratorMargeBoutonCentrer);
		}

	private void control()
		{
		//Rien
		}

	private void appearance()
		{
		layout.setHgap(MARGE);
		layout.setVgap(MARGE);

		jDecoratorMargeBorderLayout.setBorder(BorderFactory.createTitledBorder("Border layout"));
		jDecoratorMargeFlowLayout.setBorder(BorderFactory.createTitledBorder("Flow layout"));
		jDecoratorMargeSansLayout.setBorder(BorderFactory.createTitledBorder("Sans layout"));
		jDecoratorMargeGridLayout.setBorder(BorderFactory.createTitledBorder("Grid layout"));
		jDecoratorMargeCompteur.setBorder(BorderFactory.createTitledBorder("Compteur layout"));
		jDecoratorMargeHello.setBorder(BorderFactory.createTitledBorder("Hello layout"));
		jDecoratorMargeBoxLayout.setBorder(BorderFactory.createTitledBorder("Box layout"));
		jDecoratorMargeBoutonCentrer.setBorder(BorderFactory.createTitledBorder("Centrer"));
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Tools
	private GridLayout layout;
	private JPanelBorderLayout jBorderLayout;
	private JPanelFlowLayout jFlowLayout;
	private JPanelSansLayout jSansLayout;
	private JPanelGridLayout jGridLayout;
	private JPanelCompteur jCompteur;
	private JPanelHello jHello;
	private BoxBoxLayout jBoxLayout;
	private JPanelBoutonCentrer jBoutonCentrer;

	private JDecoratorMarge jDecoratorMargeBorderLayout;
	private JDecoratorMarge jDecoratorMargeFlowLayout;
	private JDecoratorMarge jDecoratorMargeSansLayout;
	private JDecoratorMarge jDecoratorMargeGridLayout;
	private JDecoratorMarge jDecoratorMargeCompteur;
	private JDecoratorMarge jDecoratorMargeHello;
	private JDecoratorMarge jDecoratorMargeBoxLayout;
	private JDecoratorMarge jDecoratorMargeBoutonCentrer;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int MARGE = 30;
	}
