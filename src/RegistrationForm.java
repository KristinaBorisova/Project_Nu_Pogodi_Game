import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.ShutdownChannelGroupException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class RegistrationForm  {

	JFrame frame;
	private JTextField textfieldUsername;
	private JTextField textFieldPassword;
	private JButton btnRegister;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationForm window2 = new RegistrationForm();
					window2.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegistrationForm() {
		initializeElements();
		register();
	}

	private void register() {
		String usernameInput = textfieldUsername.getText();
		String passwordInput = textFieldPassword.getText();

		String[] checkUsername = usernameInput.split(" ");
		String[] checkPassword = passwordInput.split(" ");
		
		if (checkUsername.length < 1 || checkUsername.length == 0) {

			if (checkUsername.length == 0 || checkPassword.length == 0) {
				JOptionPane.showMessageDialog(null, "Incorrect username or password.Try again!");
			} else {
				btnRegister.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
	//					saveUsernameInDatabase(passwordInput);
						savePasswordInDatabase();
						JOptionPane.showMessageDialog(null, "Successfull Registration!");
					}
				});
			

			}
		}
	}

	private void savePasswordInDatabase() {
	

	}

//	private void saveUsernameInDatabase(String username) {
//		CheckForExistingAccount();
//		try (FileWriter fw = new FileWriter("C:\\Users\\USER\\Desktop\\Database\\Username.txt", true);
//				BufferedWriter bw = new BufferedWriter(fw);
//				PrintWriter out = new PrintWriter(bw)) {
//			out.println(username);
//		} catch (IOException e) {
//			System.out.println(e);
//		}
//	}

	private void CheckForExistingAccount() { // If Username == username in
												// database, Choose another
		// TODO Auto-generated method stub

	}

	private void initializeElements() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(133, 189, 211, 40);
		frame.getContentPane().add(btnRegister);

		textfieldUsername = new JTextField();
		textfieldUsername.setBounds(133, 41, 266, 40);
		frame.getContentPane().add(textfieldUsername);
		textfieldUsername.setColumns(10);

		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(133, 94, 266, 40);
		frame.getContentPane().add(textFieldPassword);
		textFieldPassword.setColumns(10);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(26, 51, 89, 21);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(26, 104, 89, 21);
		frame.getContentPane().add(lblPassword);
	}
}
