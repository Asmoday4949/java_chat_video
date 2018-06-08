
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
		}

	public void loadJWebcam()
		{
		this.removeComponent(BorderLayout.CENTER);
		this.removeComponent(BorderLayout.SOUTH);

		this.add(this.jChat, BorderLayout.SOUTH);
		this.add(this.jWebcam, BorderLayout.CENTER);
		}

	public void loadJConnection()
		{
		this.removeComponent(BorderLayout.CENTER);
		this.removeComponent(BorderLayout.SOUTH);

		this.add(new JCentrer(jConnection), BorderLayout.CENTER);
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
		setLayout(new BorderLayout());

		// JComponent : add
		loadJConnection();
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
		BorderLayout layout = (BorderLayout)this.getLayout();
		Component jComponent = layout.getLayoutComponent(position);

		if(jComponent != null)
			{
			this.remove(jComponent);
			}
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
