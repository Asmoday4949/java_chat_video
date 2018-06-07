
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
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
		this.jTextAreaChat.setCaretPosition(jTextAreaChat.getDocument().getLength());
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

		jScrollPaneChat = new JScrollPane(jTextAreaChat);
		this.add(jScrollPaneChat);
		this.add(jMessageInput);
		}

	private void control()
		{
		jTextAreaChat.setEditable(false);
		jTextAreaChat.setWrapStyleWord(true);
		//jScrollPaneChat.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		}

	private void appearance()
		{
		jTextAreaChat.setPreferredSize(JTEXTAREA_CHAT_SIZE);
		//jScrollPaneChat.setPreferredSize(new Dimension(1000, 100));
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

	private static final Dimension JTEXTAREA_CHAT_SIZE = new Dimension(500, 300);

	}
