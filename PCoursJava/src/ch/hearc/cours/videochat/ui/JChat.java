package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;

public class JChat extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JChat()
		{
		super(BoxLayout.Y_AXIS);

		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jTextAreaChat = new JTextArea();
		boxMessageInput = new JMessageInput();

		this.add(jTextAreaChat);
		this.add(boxMessageInput);
		}

	private void control()
		{
		jTextAreaChat.setEditable(false);
		}

	private void appearance()
		{
		jTextAreaChat.setPreferredSize(JTEXTAREA_CHAT_SIZE);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JTextArea jTextAreaChat;
	private JMessageInput boxMessageInput;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Dimension JTEXTAREA_CHAT_SIZE = new Dimension(500, 300);

	}
