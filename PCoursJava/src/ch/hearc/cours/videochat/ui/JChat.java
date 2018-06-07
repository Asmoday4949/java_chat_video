
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

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
		jTextAreaChat = new JTextArea(10, 10);
		jMessageInput = new JMessageInput();

		jScrollPaneChat = new JScrollPane(jTextAreaChat);
		this.add(jScrollPaneChat);
		this.add(jMessageInput);
		}

	private void control()
		{
		jTextAreaChat.setEditable(false);
		jTextAreaChat.setWrapStyleWord(true);
		jScrollPaneChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		//jScrollPaneChat.setSize(100, 100);
		}

	private void appearance()
		{
		jTextAreaChat.setPreferredSize(JTEXTAREA_CHAT_SIZE);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JScrollPane jScrollPaneChat;
	private JTextArea jTextAreaChat;
	private JMessageInput jMessageInput;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Dimension JTEXTAREA_CHAT_SIZE = new Dimension(500, 150);

	}
