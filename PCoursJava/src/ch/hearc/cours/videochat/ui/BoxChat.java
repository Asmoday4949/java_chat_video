package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JTextArea;

public class BoxChat extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public BoxChat()
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
		boxMessageInput = new BoxMessageInput();

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
	private BoxMessageInput boxMessageInput;

	private Dimension JTEXTAREA_CHAT_SIZE = new Dimension(500, 300);
	}
