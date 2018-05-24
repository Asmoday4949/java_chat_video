
package ch.hearc.cours.moo.heritage.generalisation;

public class UseForme
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		UseRectangle();
		UseCarre();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void UseRectangle()
		{
		Rectangle rectangle = new Rectangle("r1", 6, 14);
		System.out.println(rectangle);
		}

	private static void UseCarre()
		{
		Carre carre = new Carre("c1", 9);
		System.out.println(carre);
		}
	}
