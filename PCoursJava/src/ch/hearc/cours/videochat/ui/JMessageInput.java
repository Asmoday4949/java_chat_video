package ch.hearc.cours.videochat.ui;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class JMessageInput extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JMessageInput()
		{
		super(BoxLayout.X_AXIS);

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
		jTextFieldMessageInput = new JTextField();
		jButtonSend = new JButton("Envoyer");

		this.add(jTextFieldMessageInput);
		this.add(Box.createHorizontalGlue());
		this.add(jButtonSend);
		}

	private void control()
		{
		}

	private void appearance()
		{
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JTextField jTextFieldMessageInput;
	private JButton jButtonSend;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int SPACE_WIDTH = 30;
	}


