
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
		jLabelNickName.setMaximumSize(new Dimension(JLABEL_WIDTH, (int)this.jLabelNickName.getMaximumSize().getHeight()));
		jLabelIP.setMaximumSize(new Dimension(JLABEL_WIDTH, (int)this.jLabelNickName.getMaximumSize().getHeight()));
		jLabelPort.setMaximumSize(new Dimension(JLABEL_WIDTH, (int)this.jLabelNickName.getMaximumSize().getHeight()));

		Dimension dNickname = this.jTextFieldNickname.getMaximumSize();
		dNickname.width = JTEXTFIELD_NICKNAME_WIDTH;
		jTextFieldNickname.setMaximumSize(dNickname);
		dNickname = this.jTextFieldNickname.getPreferredSize();
		dNickname.width = JTEXTFIELD_NICKNAME_WIDTH;
		this.jTextFieldNickname.setPreferredSize(dNickname);

		Dimension dPort = this.jTextFieldPort.getMaximumSize();
		dPort.width = JTEXTFIELD_PORT_WIDTH;
		jTextFieldPort.setMaximumSize(dPort);
		dPort = this.jTextFieldNickname.getPreferredSize();
		dPort.width = JTEXTFIELD_PORT_WIDTH;
		this.jTextFieldPort.setPreferredSize(dNickname);

		Dimension dAddress = this.jTextFieldIP.getMaximumSize();
		dAddress.width = JTEXTFIELD_IP_WIDTH;
		jTextFieldIP.setMaximumSize(dAddress);
		dAddress = this.jTextFieldIP.getPreferredSize();
		dAddress.width = JTEXTFIELD_IP_WIDTH;
		this.jTextFieldIP.setPreferredSize(dAddress);
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

	static final private int JLABEL_WIDTH = 50;
	static final private int JTEXTFIELD_NICKNAME_WIDTH = 150;
	static final private int JTEXTFIELD_IP_WIDTH = 120;
	static final private int JTEXTFIELD_PORT_WIDTH = 70;
	static final private int SPACE_WIDTH = 20;
	}
