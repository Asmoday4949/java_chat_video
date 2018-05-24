
package ch.hearc.cours.moo.heritage.generalisation;

import java.util.ArrayList;
import java.util.List;

public class Dessin
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Dessin(String nom)
		{
		this.nom = nom;
		listForme = new ArrayList<Forme_A>();
		}

	public Dessin(Dessin source)
		{
		this(source.nom); // Copie superficielle autorisee car String est inalterable
		//La liste existe mais est vide -> il faut la peupler
		for(Forme_A forme:source.listForme)
			{
			//this.listForme.add(new Forme_A(forme)); //On ne peut pas instancier des classes abstraites !

			this.listForme.add(forme.cloneOf()); //Polymorphisme -> liaison dynamique -> utilisation du type effectif
			//Question : 	Le type effectif qui ne sera connu qu'a l'execution possedera-t-il forcement
			//				une methode cloneOf() implementee ?
			//Reponse :		Oui ! Car derriere le type effectif se cache un objet qui a pu etre instancie,
			//				donc qui n'est pas abstrait, donc qui possede une methode cloneOf() implementee.
			//Observation:	A priori, jusqu'a present, les cloneOf() semblaient inutiles et redondantes par rapport
			//				au constructeur de copie. Ce n'est pas le cas, sans cloneOf(), on ne pourrait pas s'en
			//				sortir ici!
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void add(Forme_A forme)
		{
		listForme.add(forme);
		}

	@Override
	public String toString()
		{
		StringBuilder builder = new StringBuilder();
		builder.append("Dessin [nom=");
		builder.append(this.nom);
		builder.append(", listForme=");
		builder.append(this.listForme);
		builder.append("]");
		return builder.toString();
		}

	public double aire()
		{
		double aireTot = 0;
		for(Forme_A forme:listForme)
			{
			aireTot += forme.aire(); //POLYMORPHISME ! oriente hierarchie de classe
			//Fonctionne car Java utilise les liaisons statiques et dynamiques
			//La liaison dynamique est faite pendant l'execution par le runtime Java
			//Consequences : 	(+) code plus simple, flexible, souple
			//					(-) plus lent a l'execution (negligeable a l'heure actuelle (sauf hautes performances))
			}
		return aireTot;
		}

	public double perimetre()
		{
		double perimetreTot = 0;
		for(Forme_A forme:listForme)
			{
			perimetreTot += forme.perimetre();
			}
		return perimetreTot;
		}

	public double indiceGoloviatinski()
		{
		double iGoloviatinskiTot = 0;
		for(Forme_A forme:listForme)
			{
			iGoloviatinskiTot += forme.indiceGoloviatinski();
			}
		return iGoloviatinskiTot;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String nom;

	//Tools
	private List<Forme_A> listForme;

	}
