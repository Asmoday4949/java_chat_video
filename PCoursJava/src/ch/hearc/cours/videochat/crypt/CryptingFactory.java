
package ch.hearc.cours.videochat.crypt;

public class CryptingFactory
	{

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static Crypting_I createCrypting()
		{
		return createAsymmetricCrypting();
		}

	public static DumbCrypting createDumbCrypting()
		{
		return DumbCrypting.getInstance();
		}

	public static AsymmetricCrypting createAsymmetricCrypting()
		{
		return AsymmetricCrypting.getInstance();
		}
	}
