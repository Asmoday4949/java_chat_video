
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

	public void showJDisconnection(boolean show)
		{
		if(show)
			{
			this.jConnection.setVisible(false);
			this.add(jDisconnection, BorderLayout.NORTH);
			}
		else
			{
			this.jConnection.setVisible(true);
			this.remove(jDisconnection);
			}
		}

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
		jDisconnection = new JDisconnection();
		jWebcam = new JWebcam();
		jChat = new JChat();

		// Layout : Specification
		setLayout(new BorderLayout());

		// JComponent : add
		this.add(jDisconnection, BorderLayout.NORTH);
		this.add(jConnection, BorderLayout.NORTH);
		this.add(jWebcam, BorderLayout.CENTER);
		this.add(jChat, BorderLayout.SOUTH);
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
	private JDisconnection jDisconnection;
	private JWebcam jWebcam;
	private JChat jChat;

	}
