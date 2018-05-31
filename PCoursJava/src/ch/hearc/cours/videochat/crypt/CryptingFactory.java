
package ch.hearc.cours.videochat.crypt;

public class CryptingFactory
	{

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static Crypting_I createCrypting()
		{
		return new AsymmetricCrypting();
		}
	}
