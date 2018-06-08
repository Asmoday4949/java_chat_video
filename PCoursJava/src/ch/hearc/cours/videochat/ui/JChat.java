
package ch.hearc.cours.videochat.ui;

import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

import ch.hearc.cours.tools.gui.JComponentTool;

public class JChat extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JChat()
		{
		super(BoxLayout.Y_AXIS);

		this.htmlEditorKit = new HTMLEditorKit();
		this.htmlDoc = new HTMLDocument();

		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void appendText(String message)
		{
		jTextPaneChat.setCaretPosition(htmlDoc.getLength());

		try
			{
			htmlEditorKit.insertHTML(htmlDoc, htmlDoc.getLength(), message, 0, 0, null);
			}
		catch (BadLocationException e)
			{
			e.printStackTrace();
			}
		catch (IOException e)
			{
			// TODO Auto-generated catch block
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
		jTextPaneChat.setContentType("text/html");
		jTextPaneChat.setEditable(false);
		jTextPaneChat.setDocument(htmlDoc);
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

	private HTMLEditorKit htmlEditorKit;
	private HTMLDocument htmlDoc;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int JTEXTAREA_CHAT_SIZE_HEIGHT = 150;

	}
