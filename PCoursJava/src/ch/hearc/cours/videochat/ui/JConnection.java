
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JConnection extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JConnection()
		{
		super(BoxLayout.X_AXIS);

		geometry();
		control();
		appearance();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void geometry()
		{
		jLabelNickName = new JLabel("Pseudo: ");
		jLabelIP = new JLabel("IP: ");
		jLabelPort = new JLabel("Port: ");

		jTextFieldNickname = new JTextField();
		jTextFieldIP = new JTextField();
		jTextFieldPort = new JTextField();

		jButtonConnection = new JButton("Connexion");

		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		this.add(jLabelNickName);
		this.add(jTextFieldNickname);
		this.add(Box.createHorizontalGlue());
		this.add(jLabelIP);
		this.add(jTextFieldIP);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		this.add(jLabelPort);
		this.add(jTextFieldPort);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		this.add(jButtonConnection);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		}


	private void control()
		{
		jButtonConnection.addActionListener((e) -> {
		ServiceGUI.getInstance().connect(jTextFieldNickname.getText(), jTextFieldIP.getText(), Integer.parseInt(jTextFieldPort.getText()));
		});

		}

	private void appearance()
		{
		jLabelNickName.setMaximumSize(JLABEL_SIZE);
		jLabelIP.setMaximumSize(JLABEL_SIZE);
		jLabelPort.setMaximumSize(JLABEL_SIZE);

		jTextFieldNickname.setPreferredSize(JTEXTFIELD_NICKNAME_SIZE);
		jTextFieldNickname.setMaximumSize(JTEXTFIELD_NICKNAME_SIZE);

		jTextFieldPort.setPreferredSize(JTEXTFIELD_PORT_SIZE);
		jTextFieldPort.setMaximumSize(JTEXTFIELD_PORT_SIZE);

		jTextFieldIP.setPreferredSize(JTEXTFIELD_IP_SIZE);
		jTextFieldIP.setMaximumSize(JTEXTFIELD_IP_SIZE);
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JLabel jLabelNickName;
	private JLabel jLabelIP;
	private JLabel jLabelPort;
	private JTextField jTextFieldNickname;
	private JTextField jTextFieldIP;
	private JTextField jTextFieldPort;
	private JButton jButtonConnection;

	static private Dimension JLABEL_SIZE = new Dimension(50, 20);
	static private Dimension JTEXTFIELD_NICKNAME_SIZE = new Dimension(150, 20);
	static private Dimension JTEXTFIELD_IP_SIZE = new Dimension(120, 20);
	static private Dimension JTEXTFIELD_PORT_SIZE = new Dimension(70, 20);
	static private int SPACE_WIDTH = 20;
	}
