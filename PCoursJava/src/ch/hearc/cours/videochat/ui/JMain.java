
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import ch.hearc.cours.tools.gui.JCentrer;

public class JMain extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JMain()
		{
		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void showConnection()
		{
		this.removeAll();
		this.add(new JCentrer(jConnection), BorderLayout.CENTER);
		}

	public void showChat()
		{
		this.removeAll();
		this.add(jWebcam, BorderLayout.CENTER);
		this.add(jChat, BorderLayout.SOUTH);
		}

	/*------------------------------*\
	|*				Set				*|
	\*------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public JWebcam getJWebcam()
		{
		return this.jWebcam;
		}

	public JChat getJChat()
		{
		return jChat;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// JComponent : Instanciation
		jConnection = new JConnection();
		jWebcam = new JWebcam();
		jChat = new JChat();

		// Layout : Specification
		setLayout(new BorderLayout());

		// JComponent : add
		showConnection();
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JConnection jConnection;
	private JWebcam jWebcam;
	private JChat jChat;

	}
