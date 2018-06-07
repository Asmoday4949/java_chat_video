
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import org.apache.commons.validator.routines.InetAddressValidator;

public class JConnection extends Box
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JConnection()
		{
		super(BoxLayout.Y_AXIS);

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

		jNickname = new JTextField();
		jIP = new JTextField();
		jPort = new JSpinner();

		jButtonConnection = new JButton("Connexion");
		this.setAlignmentX(LEFT_ALIGNMENT);

		this.setBorder(BorderFactory.createTitledBorder("Connexion"));
		this.add(Box.createVerticalGlue());
		this.add(jLabelNickName);
		this.add(jNickname);
		this.add(Box.createVerticalStrut(SPACE));
		this.add(jLabelIP);
		this.add(jIP);
		this.add(Box.createVerticalStrut(SPACE));
		this.add(jLabelPort);
		this.add(jPort);
		this.add(Box.createVerticalStrut(SPACE));
		this.add(Box.createVerticalStrut(SPACE));
		this.add(jButtonConnection);
		this.add(Box.createVerticalGlue());
		}

	private void control()
		{
		SpinnerNumberModel model = new SpinnerNumberModel(MIN_PORT, MIN_PORT, MAX_PORT, 1);
		this.jPort.setModel(model);
		this.jPort.setEditor(new JSpinner.NumberEditor(this.jPort, "#####"));

		jButtonConnection.addActionListener((e) -> {
		if (validateForm())
			{
			ServiceGUI.getInstance().connect(jNickname.getText(), jIP.getText(), (Integer)jPort.getValue());
			}
		});
		}

	private void appearance()
		{
		jLabelNickName.setAlignmentX(LEFT_ALIGNMENT);
		jLabelNickName.setMinimumSize(NICKNAME_LABEL);
		jLabelNickName.setPreferredSize(NICKNAME_LABEL);
		jLabelNickName.setMaximumSize(NICKNAME_LABEL);

		jLabelIP.setAlignmentX(LEFT_ALIGNMENT);
		jLabelIP.setMinimumSize(IP_LABEL);
		jLabelIP.setPreferredSize(IP_LABEL);
		jLabelIP.setMaximumSize(IP_LABEL);

		jLabelPort.setAlignmentX(LEFT_ALIGNMENT);
		jLabelPort.setMinimumSize(PORT_LABEL);
		jLabelPort.setPreferredSize(PORT_LABEL);
		jLabelPort.setMaximumSize(PORT_LABEL);

		jNickname.setAlignmentX(LEFT_ALIGNMENT);
		jNickname.setMinimumSize(NICKNAME_FIELD);
		jNickname.setPreferredSize(NICKNAME_FIELD);
		jNickname.setMaximumSize(NICKNAME_FIELD);

		jIP.setAlignmentX(LEFT_ALIGNMENT);
		jIP.setMinimumSize(IP_FIELD);
		jIP.setPreferredSize(IP_FIELD);
		jIP.setMaximumSize(IP_FIELD);

		jPort.setAlignmentX(LEFT_ALIGNMENT);
		jPort.setMinimumSize(PORT_FIELD);
		jPort.setPreferredSize(PORT_FIELD);
		jPort.setMaximumSize(PORT_FIELD);

		jButtonConnection.setAlignmentX(LEFT_ALIGNMENT);
		jButtonConnection.setMinimumSize(CONNECTION_BUTTON);
		jButtonConnection.setPreferredSize(CONNECTION_BUTTON);
		jButtonConnection.setMaximumSize(CONNECTION_BUTTON);
		}

	private boolean validateForm()
		{
		InetAddressValidator validator = new InetAddressValidator();

		return validator.isValid(this.jIP.getText());
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools
	private JLabel jLabelNickName;
	private JLabel jLabelIP;
	private JLabel jLabelPort;
	private JTextField jNickname;
	private JTextField jIP;
	private JSpinner jPort;
	private JButton jButtonConnection;

	static final private  int MIN_PORT = 1024;
	static final private  int MAX_PORT = 65535;

	static final private int SPACE = 20;
	static final private Dimension IP_LABEL = new Dimension(50, 20);
	static final private Dimension PORT_LABEL = new Dimension(50, 20);
	static final private Dimension NICKNAME_LABEL = new Dimension(50, 20);
	static final private Dimension IP_FIELD = new Dimension(100, 20);
	static final private Dimension PORT_FIELD = new Dimension(100, 20);
	static final private Dimension NICKNAME_FIELD = new Dimension(100, 20);
	static final private Dimension CONNECTION_BUTTON = new Dimension(100, 20);
	}
