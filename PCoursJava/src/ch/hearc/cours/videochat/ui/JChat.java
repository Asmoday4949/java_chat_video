
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

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
		Document doc = jTextPaneChat.getDocument();
		jTextPaneChat.setCaretPosition(doc.getLength());

		try
			{
			doc.insertString(doc.getLength(), message, null);
			}
		catch (BadLocationException e)
			{
			e.printStackTrace();
			}
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
		jTextPaneChat = new JTextPane();
		jMessageInput = new JMessageInput();
		jScrollPaneChat = new JScrollPane(jTextPaneChat);

		this.add(jScrollPaneChat);
		this.add(jMessageInput);
		}

	private void control()
		{
		jTextPaneChat.setContentType("html/plain");
		jTextPaneChat.setEditable(false);
		}

	private void appearance()
		{
		jTextPaneChat.setPreferredSize(JTEXTAREA_CHAT_SIZE);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JScrollPane jScrollPaneChat;
	private JTextPane jTextPaneChat;
	private JMessageInput jMessageInput;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final Dimension JTEXTAREA_CHAT_SIZE = new Dimension(500, 300);

	}
