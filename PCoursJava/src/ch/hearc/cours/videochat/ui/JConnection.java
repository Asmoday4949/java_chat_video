
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;

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

		jNickname = new JTextField();
		jIP = new JTextField();
		jPort = new JSpinner();

		jButtonConnection = new JButton("Connexion");

		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		this.add(jLabelNickName);
		this.add(jNickname);
		this.add(Box.createHorizontalGlue());
		this.add(jLabelIP);
		this.add(jIP);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		this.add(jLabelPort);
		this.add(jPort);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
		this.add(jButtonConnection);
		this.add(Box.createHorizontalStrut(SPACE_WIDTH));
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
		jLabelNickName.setMaximumSize(new Dimension(JLABEL_WIDTH, (int)this.jLabelNickName.getMaximumSize().getHeight()));
		jLabelIP.setMaximumSize(new Dimension(JLABEL_WIDTH, (int)this.jLabelNickName.getMaximumSize().getHeight()));
		jLabelPort.setMaximumSize(new Dimension(JLABEL_WIDTH, (int)this.jLabelNickName.getMaximumSize().getHeight()));

		Dimension dNickname = this.jNickname.getMaximumSize();
		dNickname.width = JNICKNAME_WIDTH;
		jNickname.setMaximumSize(dNickname);
		dNickname = this.jNickname.getPreferredSize();
		dNickname.width = JNICKNAME_WIDTH;
		this.jNickname.setPreferredSize(dNickname);

		Dimension dAddress = this.jIP.getMaximumSize();
		dAddress.width = JIP_WIDTH;
		jIP.setMaximumSize(dAddress);
		dAddress = this.jIP.getPreferredSize();
		dAddress.width = JIP_WIDTH;
		this.jIP.setPreferredSize(dAddress);

		Dimension dPort = this.jPort.getMaximumSize();
		dPort.width = JPORT_WIDTH;
		jPort.setMaximumSize(dPort);
		dPort = this.jNickname.getPreferredSize();
		dPort.width = JPORT_WIDTH;
		this.jPort.setPreferredSize(dNickname);

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
	static final private int JLABEL_WIDTH = 50;
	static final private int JNICKNAME_WIDTH = 150;
	static final private int JIP_WIDTH = 120;
	static final private int JPORT_WIDTH = 70;
	static final private int SPACE_WIDTH = 20;
	}
