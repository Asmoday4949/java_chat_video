
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

	public void appendText(String message)
		{
		this.jTextAreaChat.append(message);
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public String getMessageInput()
		{
		return jMessageInput.getInput();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jTextAreaChat = new JTextArea();
		jMessageInput = new JMessageInput();

		this.add(jTextAreaChat);
		this.add(jMessageInput);
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
	private JMessageInput jMessageInput;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Dimension JTEXTAREA_CHAT_SIZE = new Dimension(500, 150);

	}
