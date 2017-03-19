import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;
import java.awt.event.ActionEvent;

public class RegistrationForm {

	private JFrame frame;
	private JTextField textfieldUsername;
	private JTextField textFieldPassword;
	private JButton btnRegister;

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window = new RegistrationForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public RegistrationForm() {
		initializeElements();
		register();
		checkForExistingRegistration();
	}

	
	private void checkForExistingRegistration() { 
		
		
	}


	private void register() {
		String usernameInput = textfieldUsername.getText();
		String passwordInput = textFieldPassword.getText();
		
		
	}
		



	private void initializeElements() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(124, 167, 211, 40);
		frame.getContentPane().add(btnRegister);

		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(101, 22, 278, 49);
		frame.getContentPane().add(textfieldUsername);
		textfieldUsername.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(101, 90, 278, 49);
		frame.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(12, 41, 89, 21);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(12, 104, 89, 21);
		frame.getContentPane().add(lblPassword);
	}
}
