import java.awt.EventQueue;

import javax.swing.JFrame;

public class BankGUI {

	private JFrame frame;
	BankGUI window;
	/**
	 * Launch the application.
	 */
	//Default Constructor
	public BankGUI BankGUI() {
		window = new BankGUI();
		return window;
	}
	/**
	 * Create the application.
	 */
	public void CreateWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
