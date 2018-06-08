
package ch.hearc.cours.videochat.ui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import ch.hearc.cours.videochat.network.Settings;

public class JIPLabel extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JIPLabel()
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
		jLabelIP = new JLabel("IP: ");
		jLabelYourIP = new JLabel("(" + Settings.getInstance().getLocal().getHostAddress() + ")");

		// Layout : Specification
		FlowLayout flowlayout = new FlowLayout(FlowLayout.LEFT);
		setLayout(flowlayout);

		// JComponent : add
		this.add(jLabelIP);
		this.add(jLabelYourIP);

		}

	private void control()
		{
		// rien
		}

	private void appearance()
		{
		jLabelYourIP.setFont(new Font("Courier", Font.BOLD, 12));
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JLabel jLabelIP;
	private JLabel jLabelYourIP;

	}
