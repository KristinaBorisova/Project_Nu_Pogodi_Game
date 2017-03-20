import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class UserLogInForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogInForm frame = new UserLogInForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserLogInForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLogIn.setBounds(135, 164, 207, 44);
		contentPane.add(btnLogIn);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Trajan Pro", Font.PLAIN, 14));
		lblUsername.setBounds(12, 52, 136, 24);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(108, 41, 304, 44);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Trajan Pro", Font.PLAIN, 15));
		lblPassword.setBounds(12, 109, 85, 24);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 98, 304, 44);
		contentPane.add(passwordField);
	}

}
