
package ch.hearc.cours.moo.heritage.specialisation.hello;

public class UseHmsTimes
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
		useHmsTimes1();
		}

	private static void useHmsTimes1()
		{
		HmsTimes hmstimes = new HmsTimes(1, 2, 3);
		System.out.println(hmstimes);

		hmstimes.set(10, 20, 30);
		System.out.println(hmstimes);

		hmstimes.set(100, 200);
		System.out.println(hmstimes);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
}

