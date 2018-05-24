
package ch.hearc.cours.moo.heritage.generalisation;

public abstract class Polygone extends Forme_A
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Polygone(String nom, int nombreDeCote)
		{
		super(nom);
		this.nombreDeCote = nombreDeCote;
		}

	public Polygone(Polygone source)
		{
		//this(source.getNom(), source.nombreDeCote); //V1 : Horrible si la classe parente a plein d'attributs et impossible si pas de getters
		super(source); //V2 : Meilleur mais nécessite l'existance d'un constructeur par recopie
		this.nombreDeCote = source.nombreDeCote;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append(NOMBRE_DE_COTE);
		stringBuilder.append(nombreDeCote);
		return stringBuilder.toString();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private int nombreDeCote;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String NOMBRE_DE_COTE = " nombre de cote:";
	}
