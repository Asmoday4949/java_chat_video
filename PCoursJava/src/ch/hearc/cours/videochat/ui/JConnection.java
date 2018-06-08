
package ch.hearc.cours.videochat.ui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import org.apache.commons.validator.routines.InetAddressValidator;

public class JConnection extends JPanel
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	public JConnection()
		{
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
		jLabelPort = new JLabel("Port: ");
		jNickname = new JTextField();
		jIPLabel = new JIPLabel();
		jIP = new JTextField();
		jPort = new JSpinner();
		jButtonConnection = new JButton("Connexion");

		this.setLayout(new GridLayout(-1, 1));

		this.add(jLabelNickName);
		this.add(jNickname);
		this.add(jIPLabel);
		this.add(jIP);
		this.add(jLabelPort);
		this.add(jPort);
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
		this.setPreferredSize(new Dimension(JCONNECTION_WIDTH, JCONNECTION_HEIGHT));
		this.setMaximumSize(new Dimension(JCONNECTION_WIDTH, JCONNECTION_HEIGHT));
		this.setMinimumSize(new Dimension(JCONNECTION_WIDTH, JCONNECTION_HEIGHT));
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
	private JIPLabel jIPLabel;
	private JLabel jLabelPort;
	private JTextField jNickname;
	private JTextField jIP;
	private JSpinner jPort;
	private JButton jButtonConnection;

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static final int MIN_PORT = 1024;
	private static final int MAX_PORT = 65535;

	private static final int SPACE = 20;
	private static final int JCONNECTION_WIDTH = 250;
	private static final int JCONNECTION_HEIGHT = 325;

	}
