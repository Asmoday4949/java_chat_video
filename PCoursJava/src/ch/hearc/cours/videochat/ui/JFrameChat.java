package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameChat extends JFrame
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JFrameChat()
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
		boxConnection = new BoxConnection();
		jDisplayWebcam = new JDisplayWebcam();
		boxChat = new BoxChat();

		borderLayout = new BorderLayout();
		setLayout(borderLayout);

		this.add(boxConnection, BorderLayout.NORTH);
		this.add(jDisplayWebcam);
		this.add(boxChat, BorderLayout.SOUTH);
		}

	private void control()
		{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	private void appearance()
		{
		setSize(600, 400);
		setLocationRelativeTo(null); // frame centrer
		setVisible(true); // last!
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private BorderLayout borderLayout;

	private BoxConnection boxConnection;
	private JDisplayWebcam jDisplayWebcam;
	private BoxChat boxChat;
	}
