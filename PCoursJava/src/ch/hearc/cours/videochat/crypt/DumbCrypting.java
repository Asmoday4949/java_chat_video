
package ch.hearc.cours.videochat.crypt;

import java.security.PublicKey;

public class DumbCrypting implements Crypting_I
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	@Override
	public String encrypt(String stringToCrypt, PublicKey key)
		{
		return stringToCrypt + " IT IS SAFELY CRYPTED";
		}

	@Override
	public String decrypt(String encryptedString)
		{
		return encryptedString.substring(0, encryptedString.length() - 20);
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	@Override
	public PublicKey getPublicKey()
		{
		return null; // no public key in dumb crypting
		}
	}
