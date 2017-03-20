import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class UserRegistrationForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textfieldPassword;
	private String usernameInput;
	private String userPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistrationForm frame = new UserRegistrationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void wordsToFiles() {
		usernameInput = textFieldUsername.getText();
		userPassword = textfieldPassword.getText();

		if (usernameInput.split(" ").length == 0 && (userPassword.split(" ").length == 0)) {
			JOptionPane.showMessageDialog(null, "Error,try again");
		} else {

			addUsernameToData(usernameInput);
			addPasswordToData(userPassword);
			JOptionPane.showMessageDialog(null, "Successfull registration!");
		}

	}

	private void addPasswordToData(String userPassword) {
		try (FileWriter fw = new FileWriter("C:\\Users\\USER\\Desktop\\Project\\TryOutDatabase\\DataBaseUserName",true); 
				BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
			out.println(userPassword);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	private void addUsernameToData(String usernameInput) {
		try (FileWriter fw = new FileWriter("C:\\Users\\USER\\Desktop\\Project\\TryOutDatabase\\DataBaseUserName",
				true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
			out.println(userPassword);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public UserRegistrationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsernamel = new JLabel("Username:");
		lblUsernamel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsernamel.setBounds(30, 60, 109, 16);
		contentPane.add(lblUsernamel);

		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(116, 52, 289, 33);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBounds(30, 99, 87, 16);
		contentPane.add(lblPassword);

		textfieldPassword = new JTextField();
		textfieldPassword.setBounds(116, 90, 289, 36);
		contentPane.add(textfieldPassword);
		textfieldPassword.setColumns(10);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}

		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(157, 154, 172, 33);
		contentPane.add(btnRegister);
	}

}
