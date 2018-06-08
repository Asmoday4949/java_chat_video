
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;
import java.awt.Image;

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

	public void setImage(Image image)
		{
		this.jImage.setImage(image);
		}

	public void loadJImage()
		{
//		if(this.checkCenterIsNotConnection())
//			{
//			this.removeCenterComponent();
//			this.add(this.jImage, BorderLayout.CENTER);
//			}
		}

	public void loadJWebcam()
		{
//		if(this.checkCenterIsNotConnection())
//			{
//			this.removeCenterComponent();
//			this.add(this.jWebcam, BorderLayout.CENTER);
//			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private boolean checkCenterIsNotConnection()
		{
		BorderLayout layout = (BorderLayout)this.getLayout();
		return layout.getLayoutComponent(BorderLayout.CENTER) != this.jConnection;
		}

	private void geometry()
		{
		// JComponent : Instanciation
		jConnection = new JConnection();
		jWebcam = new JWebcam();
		jChat = new JChat();
		jImage = new JImage();

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
	private JWebcam jWebcam;
	private JImage jImage;
	private JChat jChat;

	}
