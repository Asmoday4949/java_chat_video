
package ch.hearc.cours.videochat.crypt;

public class CryptingFactory
	{

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static Crypting_I createCrypting()
		{
		return createDumbCrypting();
		}

	public static DumbCrypting createDumbCrypting()
		{
		return new DumbCrypting();
		}

	public static AsymmetricCrypting createAsymmetricCrypting()
		{
		return AsymmetricCrypting.getInstance();
		}
	}
