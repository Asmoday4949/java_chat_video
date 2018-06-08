
package ch.hearc.cours.videochat.ui;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import ch.hearc.cours.tools.gui.JComponentTool;

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
		JComponentTool.setPreferredHeight(jTextPaneChat, JTEXTAREA_CHAT_SIZE_HEIGHT);
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

	private static final int JTEXTAREA_CHAT_SIZE_HEIGHT = 150;

	}
