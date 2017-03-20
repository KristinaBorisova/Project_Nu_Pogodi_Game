import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUserScreen {

	private JFrame frame;
	private JButton btnRegister;
	private JButton btnPlayGame;
	private JButton btnLogIn;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUserScreen window = new MainUserScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainUserScreen() {
		initializeElements();
//		buttonsActinos();
	}
	

	
//		btnPlayGame.addActionListener(new ActionListener() { // PlayGame Button sends us to PlayGameClass
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
//
//		
//		
//		btnLogIn.addActionListener(new ActionListener() { //LogIn Button opens Login Form
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		
		
	
	

	/*private void buttonsActinos() {
		
		btnRegister.addActionListener(new ActionListener() { //Register button opens RegistrationForm Class
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "emiii");
			}
		});
		
	}



	
	
	
	
	
	
	
	
	
	
	
	*/
	private void initializeElements() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnPlayGame = new JButton("Play Game");
		btnPlayGame.setFont(new Font("Trajan Pro", Font.BOLD, 21));
		btnPlayGame.setBounds(197, 163, 227, 60);
		frame.getContentPane().add(btnPlayGame);

		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserLogInForm logIn = new UserLogInForm(); 
				logIn.setVisible(true);
			}
		});
		btnLogIn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLogIn.setBounds(253, 236, 128, 43);
		frame.getContentPane().add(btnLogIn);

		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				UserRegistrationForm register = new UserRegistrationForm();
				register.setVisible(true);
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(253, 292, 128, 40);
		frame.getContentPane().add(btnRegister);
	}

}
