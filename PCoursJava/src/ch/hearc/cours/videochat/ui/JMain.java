
package ch.hearc.cours.videochat.ui;

import java.awt.BorderLayout;
import java.awt.Component;
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
		this.removeComponent(BorderLayout.CENTER);
		this.removeComponent(BorderLayout.SOUTH);

		this.add(this.jChat, BorderLayout.SOUTH);
		this.add(this.jImage, BorderLayout.CENTER);
		this.revalidate();
		}

	public void loadJWebcam()
		{
		this.removeComponent(BorderLayout.CENTER);
		this.removeComponent(BorderLayout.SOUTH);

		this.add(this.jChat, BorderLayout.SOUTH);
		this.add(this.jWebcam, BorderLayout.CENTER);
		this.revalidate();
		}

	public void loadJConnection()
		{
		this.removeComponent(BorderLayout.CENTER);
		this.removeComponent(BorderLayout.SOUTH);

		this.add(new JCentrer(jConnection), BorderLayout.CENTER);
		this.revalidate();
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
		jImage = new JImage();

		// Layout : Specification
		borderLayout = new BorderLayout();
		setLayout(borderLayout);

		// JComponent : add
		//loadJConnection();
		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{

		}

	private void removeComponent(String position)
		{
		Component jComponent = borderLayout.getLayoutComponent(position);
		if (jComponent != null)
			{
			this.remove(jComponent);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private BorderLayout borderLayout;
	private JConnection jConnection;
	private JWebcam jWebcam;
	private JImage jImage;
	private JChat jChat;

	}
