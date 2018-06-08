
package ch.hearc.cours.videochat.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class JDisconnection extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JDisconnection()
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
		jButtonDisconnect = new JButton("Déconnexion");

		this.add(Box.createHorizontalGlue());
		this.add(jButtonDisconnect);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		}

	private void control()
		{
		ActionListener listener = new ActionListener()
			{

			@Override
			public void actionPerformed(ActionEvent arg0)
				{
				//ServiceRMI.getInstance().
				}
			};
		}

	private void appearance()
		{
		// rien
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	JButton jButtonDisconnect;
	static final private int SPACE_WIDTH = 20;
	}
