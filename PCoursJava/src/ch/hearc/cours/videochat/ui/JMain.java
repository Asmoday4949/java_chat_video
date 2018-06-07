
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;
import java.awt.Image;

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
		if (show)
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

	public void setImage(Image image)
		{
		this.jImage.setImage(image);
		}

	public void loadJImage()
		{
		this.removeCenterComponent();
		this.add(this.jImage, BorderLayout.CENTER);
		}

	public void loadJWebcam()
		{
		this.removeCenterComponent();
		this.add(this.jImage, BorderLayout.CENTER);
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
		jImage = new JImage();

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

	private void removeCenterComponent()
		{
		BorderLayout layout = (BorderLayout)this.getLayout();
		this.remove(layout.getLayoutComponent(BorderLayout.CENTER));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JConnection jConnection;
	private JDisconnection jDisconnection;
	private JWebcam jWebcam;
	private JImage jImage;
	private JChat jChat;

	}
