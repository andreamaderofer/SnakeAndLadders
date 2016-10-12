import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class Gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
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
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnEasy = new JRadioButton("easy");
		rdbtnEasy.setBounds(6, 31, 49, 23);
		panel.add(rdbtnEasy);
		
		JRadioButton radioButton = new JRadioButton("medium");
		radioButton.setBounds(6, 57, 109, 23);
		panel.add(radioButton);
		
		JRadioButton rdbtnDifficult = new JRadioButton("hard");
		rdbtnDifficult.setBounds(6, 83, 109, 23);
		panel.add(rdbtnDifficult);
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		lblDifficulty.setBounds(10, 10, 46, 14);
		panel.add(lblDifficulty);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(224, 10, 46, 14);
		panel.add(lblNewLabel);
	}
}
