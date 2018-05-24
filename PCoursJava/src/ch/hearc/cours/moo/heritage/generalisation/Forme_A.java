
package ch.hearc.cours.moo.heritage.generalisation;

public abstract class Forme_A
	{
	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public Forme_A(String nom)
		{
		this.nom = nom;
		}

	public Forme_A(Forme_A source)
		{
		this(source.nom);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Abstract						*|
	\*------------------------------------------------------------------*/

	//Ces trois methodes sont forcement implementees si on arrive a instancier un objet des sous-classes
	public abstract Forme_A cloneOf();

	public abstract double aire();

	public abstract double perimetre();

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public double indiceGoloviatinski()
		{
		return this.aire() / this.perimetre();
		//C'est la methode aire() du type effectif cache derriere this qui va etre utilisee.
		//Le type effectif cache un objet qui a pu etre instancie, donc qui n'est pas abstrait,
		//donc qui possede necessairement une methode aire() implementee. (pareil pour perimetre())
		}

	@Override
	public String toString()
		{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(NOM2);
		stringBuilder.append(nom);
		stringBuilder.append(AIRE);
		stringBuilder.append(aire());
		stringBuilder.append(PERIMETRE);
		stringBuilder.append(perimetre());
		return stringBuilder.toString();
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getNom()
		{
		return this.nom;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//Input
	private String nom;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final String NOM2 = "nom :";
	private static final String PERIMETRE = " perimetre :";
	private static final String AIRE = " aire :";

	}
