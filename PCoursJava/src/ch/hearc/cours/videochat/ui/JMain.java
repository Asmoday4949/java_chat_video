
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import ch.hearc.cours.videochat.webcam.JDisplayWebcam;

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

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		// JComponent : Instanciation
		boxConnection = new JConnection();
		jDisplayWebcam = new JDisplayWebcam();
		boxChat = new JChat();

		// Layout : Specification
		setLayout(new BorderLayout());

		// JComponent : add
		this.add(boxConnection, BorderLayout.NORTH);
		this.add(jDisplayWebcam, BorderLayout.CENTER);
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
	private JDisplayWebcam jDisplayWebcam;
	private JChat boxChat;

	}
