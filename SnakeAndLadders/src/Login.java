

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

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
		contentPane.setLayout(null);
		
		JPanel[][] panelarray = new JPanel[6][6];
		
		JPanel panel_R6R5 = new JPanel();
		panel_R6R5.setBackground(Color.ORANGE);
		panel_R6R5.setBounds(68, 0, 60, 52);
		contentPane.add(panel_R6R5);
		
		JPanel panel_R6R6 = new JPanel();
		panel_R6R6.setBackground(Color.GREEN);
		panel_R6R6.setBounds(0, 0, 68, 52);
		contentPane.add(panel_R6R6);
		
		JPanel panel_R6R4 = new JPanel();
		panel_R6R4.setBackground(Color.GREEN);
		panel_R6R4.setBounds(129, 0, 68, 52);
		contentPane.add(panel_R6R4);
		
		JPanel panel_R6R3 = new JPanel();
		panel_R6R3.setBackground(Color.ORANGE);
		panel_R6R3.setBounds(197, 0, 60, 52);
		contentPane.add(panel_R6R3);
		
		JPanel panel_R6R2 = new JPanel();
		panel_R6R2.setBackground(Color.GREEN);
		panel_R6R2.setBounds(258, 0, 68, 52);
		contentPane.add(panel_R6R2);
		
		JPanel panel_R6R1 = new JPanel();
		panel_R6R1.setBackground(Color.ORANGE);
		panel_R6R1.setBounds(326, 0, 60, 52);
		contentPane.add(panel_R6R1);
		
		JPanel panel_R5L1 = new JPanel();
		panel_R5L1.setBackground(Color.ORANGE);
		panel_R5L1.setBounds(0, 51, 60, 52);
		contentPane.add(panel_R5L1);
		
		JPanel panel_R5L2 = new JPanel();
		panel_R5L2.setBackground(Color.GREEN);
		panel_R5L2.setBounds(60, 51, 68, 52);
		contentPane.add(panel_R5L2);
		
		JPanel panel_R5L3 = new JPanel();
		panel_R5L3.setBackground(Color.ORANGE);
		panel_R5L3.setBounds(129, 51, 60, 52);
		contentPane.add(panel_R5L3);
		
		JPanel panel_R5L4 = new JPanel();
		panel_R5L4.setBackground(Color.GREEN);
		panel_R5L4.setBounds(189, 51, 68, 52);
		contentPane.add(panel_R5L4);
		
		JPanel panel_R5L6 = new JPanel();
		panel_R5L6.setBackground(Color.GREEN);
		panel_R5L6.setBounds(318, 51, 68, 52);
		contentPane.add(panel_R5L6);
		
		JPanel panel_R5L5 = new JPanel();
		panel_R5L5.setBackground(Color.ORANGE);
		panel_R5L5.setBounds(258, 51, 60, 52);
		contentPane.add(panel_R5L5);
		
		JPanel panel_R4R6 = new JPanel();
		panel_R4R6.setBackground(Color.GREEN);
		panel_R4R6.setBounds(0, 105, 68, 52);
		contentPane.add(panel_R4R6);
		
		JPanel panel_R4R5 = new JPanel();
		panel_R4R5.setBackground(Color.ORANGE);
		panel_R4R5.setBounds(68, 105, 60, 52);
		contentPane.add(panel_R4R5);
		
		JPanel panel_R4R4 = new JPanel();
		panel_R4R4.setBackground(Color.GREEN);
		panel_R4R4.setBounds(129, 105, 68, 52);
		contentPane.add(panel_R4R4);
		
		JPanel panel_R4R3 = new JPanel();
		panel_R4R3.setBackground(Color.ORANGE);
		panel_R4R3.setBounds(197, 105, 60, 52);
		contentPane.add(panel_R4R3);
		
		JPanel panel_R4R2 = new JPanel();
		panel_R4R2.setBackground(Color.GREEN);
		panel_R4R2.setBounds(258, 105, 68, 52);
		contentPane.add(panel_R4R2);
		
		JPanel panel_R4R1 = new JPanel();
		panel_R4R1.setBackground(Color.ORANGE);
		panel_R4R1.setBounds(326, 105, 60, 52);
		contentPane.add(panel_R4R1);
		
		JPanel panel_R3L6 = new JPanel();
		panel_R3L6.setBackground(Color.GREEN);
		panel_R3L6.setBounds(318, 156, 68, 52);
		contentPane.add(panel_R3L6);
		
		JPanel panel_R3L5 = new JPanel();
		panel_R3L5.setBackground(Color.ORANGE);
		panel_R3L5.setBounds(258, 156, 60, 52);
		contentPane.add(panel_R3L5);
		
		JPanel panel_R3L4 = new JPanel();
		panel_R3L4.setBackground(Color.GREEN);
		panel_R3L4.setBounds(189, 156, 68, 52);
		contentPane.add(panel_R3L4);
		
		JPanel panel_R3L3 = new JPanel();
		panel_R3L3.setBackground(Color.ORANGE);
		panel_R3L3.setBounds(129, 156, 60, 52);
		contentPane.add(panel_R3L3);
		
		JPanel panel_R3L2 = new JPanel();
		panel_R3L2.setBackground(Color.GREEN);
		panel_R3L2.setBounds(60, 156, 68, 52);
		contentPane.add(panel_R3L2);
		
		JPanel panel_R3L1 = new JPanel();
		panel_R3L1.setBackground(Color.ORANGE);
		panel_R3L1.setBounds(0, 156, 60, 52);
		contentPane.add(panel_R3L1);
		
		JPanel panel_R2R6 = new JPanel();
		panel_R2R6.setBackground(Color.GREEN);
		panel_R2R6.setBounds(0, 210, 68, 52);
		contentPane.add(panel_R2R6);
		
		JPanel panel_R2R5 = new JPanel();
		panel_R2R5.setBackground(Color.ORANGE);
		panel_R2R5.setBounds(68, 210, 60, 52);
		contentPane.add(panel_R2R5);
		
		JPanel panel_R2R4 = new JPanel();
		panel_R2R4.setBackground(Color.GREEN);
		panel_R2R4.setBounds(129, 210, 68, 52);
		contentPane.add(panel_R2R4);
		
		JPanel panel_R2R3 = new JPanel();
		panel_R2R3.setBackground(Color.ORANGE);
		panel_R2R3.setBounds(197, 210, 60, 52);
		contentPane.add(panel_R2R3);
		
		JPanel panel_R2R2 = new JPanel();
		panel_R2R2.setBackground(Color.GREEN);
		panel_R2R2.setBounds(258, 210, 68, 52);
		contentPane.add(panel_R2R2);
		
		JPanel panel_R2R1 = new JPanel();
		panel_R2R1.setBackground(Color.ORANGE);
		panel_R2R1.setBounds(326, 210, 60, 52);
		contentPane.add(panel_R2R1);
		
		JPanel panel_R1L6 = new JPanel();
		panel_R1L6.setBackground(Color.GREEN);
		panel_R1L6.setBounds(318, 261, 68, 52);
		contentPane.add(panel_R1L6);
		
		JPanel panel_R1L5 = new JPanel();
		panel_R1L5.setBackground(Color.ORANGE);
		panel_R1L5.setBounds(258, 261, 60, 52);
		contentPane.add(panel_R1L5);
		
		JPanel panel_R1L4 = new JPanel();
		panel_R1L4.setBackground(Color.GREEN);
		panel_R1L4.setBounds(189, 261, 68, 52);
		contentPane.add(panel_R1L4);
		
		JPanel panel_R1L3 = new JPanel();
		panel_R1L3.setBackground(Color.ORANGE);
		panel_R1L3.setBounds(129, 261, 60, 52);
		contentPane.add(panel_R1L3);
		
		JPanel panel_R1L2 = new JPanel();
		panel_R1L2.setBackground(Color.GREEN);
		panel_R1L2.setBounds(60, 261, 68, 52);
		contentPane.add(panel_R1L2);
		
		JPanel panel_R1L1 = new JPanel();
		panel_R1L1.setBackground(Color.ORANGE);
		panel_R1L1.setBounds(0, 261, 60, 52);
		contentPane.add(panel_R1L1);
	}
}
