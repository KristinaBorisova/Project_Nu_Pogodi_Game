import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;

public class MainUserScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public MainUserScreen() {
		initializeElements();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializeElements() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnPlayGame = new JButton("Play Game");
		btnPlayGame.setFont(new Font("Trajan Pro", Font.BOLD, 18));
		btnPlayGame.setBounds(131, 97, 186, 51);
		frame.getContentPane().add(btnPlayGame);

		JButton btnLogIn = new JButton("Log in");
		btnLogIn.setBounds(180, 161, 115, 25);
		frame.getContentPane().add(btnLogIn);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(180, 190, 115, 25);
		frame.getContentPane().add(btnRegister);
	}

}
