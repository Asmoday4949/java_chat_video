
package ch.hearc.cours.videochat.crypt;

import java.security.InvalidKeyException;
import java.security.PublicKey;

public interface Crypting_I
	{
	public String encrypt(String stringToCrypt, PublicKey key) throws InvalidKeyException;

	public String decrypt(String encryptedString);

	public PublicKey getPublicKey();
	}