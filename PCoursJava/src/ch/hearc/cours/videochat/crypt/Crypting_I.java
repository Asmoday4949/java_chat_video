
package ch.hearc.cours.videochat.crypt;

import java.security.InvalidKeyException;
import java.security.PublicKey;

public interface Crypting_I
	{
	public byte[] encrypt(String stringToCrypt, PublicKey key) throws InvalidKeyException;

	public String decrypt(byte[] encryptedString);

	public PublicKey getPublicKey();
	}