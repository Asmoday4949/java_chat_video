
package ch.hearc.cours.videochat.network;

import java.security.PublicKey;

import org.junit.Assert;

public class ChatRemote
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private ChatRemote()
		{
		//Rien
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Chat_I getChat()
		{
		return chatRemote;
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	/**
	 * To call only one time before getInstance
	 */
	public synchronized static void init(Chat_I chatRemote)
		{
		Assert.assertTrue(instance == null);
		ChatRemote.chatRemote = chatRemote;
		}

	/**
	 * must call init before the first time
	 */
	public synchronized static ChatRemote getInstance()
		{
		if (instance == null)
			{
			Assert.assertTrue(chatRemote != null);
			instance = new ChatRemote();
			}

		return instance;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static Chat_I chatRemote = null;
	private static PublicKey publicKey = null;
	private static ChatRemote instance = null;

	}
