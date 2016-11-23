
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GridLayout;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel[][] panelarray = new JPanel[6][6];
		contentPane.setLayout(new GridLayout(0, 9, 0, 0));

		JPanel panel_R6R6 = new JPanel();
		panel_R6R6.setBackground(Color.GREEN);
		contentPane.add(panel_R6R6);
		
				JPanel panel_R5L2 = new JPanel();
				panel_R5L2.setBackground(Color.GREEN);
				contentPane.add(panel_R5L2);
		
				JPanel panel_R6R5 = new JPanel();
				panel_R6R5.setBackground(Color.ORANGE);
				contentPane.add(panel_R6R5);
		
				JPanel panel_R6R4 = new JPanel();
				panel_R6R4.setBackground(Color.GREEN);
				contentPane.add(panel_R6R4);
		
				JPanel panel_R5L4 = new JPanel();
				panel_R5L4.setBackground(Color.GREEN);
				contentPane.add(panel_R5L4);
		
				JPanel panel_R6R3 = new JPanel();
				panel_R6R3.setBackground(Color.ORANGE);
				contentPane.add(panel_R6R3);
		
				JPanel panel_R6R2 = new JPanel();
				panel_R6R2.setBackground(Color.GREEN);
				contentPane.add(panel_R6R2);
		
				JPanel panel_R5L6 = new JPanel();
				panel_R5L6.setBackground(Color.GREEN);
				contentPane.add(panel_R5L6);
		
				JPanel panel_R6R1 = new JPanel();
				panel_R6R1.setBackground(Color.ORANGE);
				contentPane.add(panel_R6R1);
		
				JPanel panel_R4R6 = new JPanel();
				panel_R4R6.setBackground(Color.GREEN);
				contentPane.add(panel_R4R6);
		
				JPanel panel_R3L2 = new JPanel();
				panel_R3L2.setBackground(Color.GREEN);
				contentPane.add(panel_R3L2);
		
				JPanel panel_R4R5 = new JPanel();
				panel_R4R5.setBackground(Color.ORANGE);
				contentPane.add(panel_R4R5);
		
				JPanel panel_R4R4 = new JPanel();
				panel_R4R4.setBackground(Color.GREEN);
				contentPane.add(panel_R4R4);
		
				JPanel panel_R3L4 = new JPanel();
				panel_R3L4.setBackground(Color.GREEN);
				contentPane.add(panel_R3L4);
		
				JPanel panel_R4R3 = new JPanel();
				panel_R4R3.setBackground(Color.ORANGE);
				contentPane.add(panel_R4R3);
		
				JPanel panel_R4R2 = new JPanel();
				panel_R4R2.setBackground(Color.GREEN);
				contentPane.add(panel_R4R2);
		
				JPanel panel_R3L6 = new JPanel();
				panel_R3L6.setBackground(Color.GREEN);
				contentPane.add(panel_R3L6);
		
				JPanel panel_R4R1 = new JPanel();
				panel_R4R1.setBackground(Color.ORANGE);
				contentPane.add(panel_R4R1);
		
				JPanel panel_R2R6 = new JPanel();
				panel_R2R6.setBackground(Color.GREEN);
				contentPane.add(panel_R2R6);
		
				JPanel panel_R1L2 = new JPanel();
				panel_R1L2.setBackground(Color.GREEN);
				contentPane.add(panel_R1L2);
		
				JPanel panel_R2R5 = new JPanel();
				panel_R2R5.setBackground(Color.ORANGE);
				contentPane.add(panel_R2R5);
		
				JPanel panel_R2R4 = new JPanel();
				panel_R2R4.setBackground(Color.GREEN);
				contentPane.add(panel_R2R4);
		
				JPanel panel_R1L4 = new JPanel();
				panel_R1L4.setBackground(Color.GREEN);
				contentPane.add(panel_R1L4);
		
				JPanel panel_R2R3 = new JPanel();
				panel_R2R3.setBackground(Color.ORANGE);
				contentPane.add(panel_R2R3);
		
				JPanel panel_R2R2 = new JPanel();
				panel_R2R2.setBackground(Color.GREEN);
				contentPane.add(panel_R2R2);
		
				JPanel panel_R1L6 = new JPanel();
				panel_R1L6.setBackground(Color.GREEN);
				contentPane.add(panel_R1L6);
		
				JPanel panel_R2R1 = new JPanel();
				panel_R2R1.setBackground(Color.ORANGE);
				contentPane.add(panel_R2R1);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("");
		contentPane.add(label_8);

		JPanel panel_R5L1 = new JPanel();
		panel_R5L1.setBackground(Color.ORANGE);
		contentPane.add(panel_R5L1);

		JPanel panel_R5L3 = new JPanel();
		panel_R5L3.setBackground(Color.ORANGE);
		contentPane.add(panel_R5L3);

		JPanel panel_R5L5 = new JPanel();
		panel_R5L5.setBackground(Color.ORANGE);
		contentPane.add(panel_R5L5);

		JPanel panel_R3L1 = new JPanel();
		panel_R3L1.setBackground(Color.ORANGE);
		contentPane.add(panel_R3L1);
														
																JPanel panel_R3L3 = new JPanel();
																panel_R3L3.setBackground(Color.ORANGE);
																contentPane.add(panel_R3L3);
						
								JPanel panel_R3L5 = new JPanel();
								panel_R3L5.setBackground(Color.ORANGE);
								contentPane.add(panel_R3L5);
				
						JPanel panel_R1L1 = new JPanel();
						panel_R1L1.setBackground(Color.ORANGE);
						contentPane.add(panel_R1L1);
				
						JPanel panel_R1L3 = new JPanel();
						panel_R1L3.setBackground(Color.ORANGE);
						contentPane.add(panel_R1L3);
				
						JPanel panel_R1L5 = new JPanel();
						panel_R1L5.setBackground(Color.ORANGE);
						contentPane.add(panel_R1L5);
	}
}
