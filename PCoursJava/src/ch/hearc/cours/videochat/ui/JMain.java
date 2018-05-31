
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

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
		return boxChat;
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// JComponent : Instanciation
		boxConnection = new JConnection();
		jWebcam = new JWebcam();
		boxChat = new JChat();

		// Layout : Specification
		setLayout(new BorderLayout());

		// JComponent : add
		this.add(boxConnection, BorderLayout.NORTH);
		this.add(jWebcam, BorderLayout.CENTER);
		this.add(boxChat, BorderLayout.SOUTH);
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JConnection boxConnection;
	private JWebcam jWebcam;
	private JChat boxChat;

	}
