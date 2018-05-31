
package ch.hearc.cours.videochat.network;

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
	 * A appeler une seule fois et avant le getInstance!!!
	 */
	public synchronized static void init(Chat_I chatRemote)
		{
		Assert.assertTrue(instance == null);
		ChatRemote.chatRemote = chatRemote;
		}

	/**
	 * A appeler exactement une fois INIT avant
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

	private static Chat_I chatRemote;
	private static ChatRemote instance = null;

	}
