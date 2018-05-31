
package ch.hearc.cours.videochat.crypt;

import java.security.InvalidKeyException;
import java.security.PublicKey;

public class DumbCrypting implements Crypting_I
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public byte[] encrypt(byte[] data, PublicKey key) throws InvalidKeyException
		{
		byte[] encryptedData = new byte[data.length];



		return null;
		}

	@Override
	public byte[] decrypt(byte[] data)
		{


		return null;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public PublicKey getPublicKey()
		{
		return null; // no public key in dumb crypting
		}


	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	}

