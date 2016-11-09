

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
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(Color.ORANGE);
		panel_32.setBounds(68, 0, 60, 52);
		contentPane.add(panel_32);
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(Color.GREEN);
		panel_33.setBounds(0, 0, 68, 52);
		contentPane.add(panel_33);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(Color.GREEN);
		panel_34.setBounds(129, 0, 68, 52);
		contentPane.add(panel_34);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(Color.ORANGE);
		panel_35.setBounds(197, 0, 60, 52);
		contentPane.add(panel_35);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(Color.GREEN);
		panel_40.setBounds(258, 0, 68, 52);
		contentPane.add(panel_40);
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(Color.ORANGE);
		panel_41.setBounds(326, 0, 60, 52);
		contentPane.add(panel_41);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(Color.ORANGE);
		panel_26.setBounds(0, 51, 60, 52);
		contentPane.add(panel_26);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(Color.GREEN);
		panel_27.setBounds(60, 51, 68, 52);
		contentPane.add(panel_27);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(Color.ORANGE);
		panel_28.setBounds(129, 51, 60, 52);
		contentPane.add(panel_28);
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(Color.GREEN);
		panel_29.setBounds(189, 51, 68, 52);
		contentPane.add(panel_29);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(Color.GREEN);
		panel_30.setBounds(318, 51, 68, 52);
		contentPane.add(panel_30);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(Color.ORANGE);
		panel_31.setBounds(258, 51, 60, 52);
		contentPane.add(panel_31);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setBounds(0, 105, 68, 52);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(68, 105, 60, 52);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(129, 105, 68, 52);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(197, 105, 60, 52);
		contentPane.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.GREEN);
		panel_4.setBounds(258, 105, 68, 52);
		contentPane.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(326, 105, 60, 52);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GREEN);
		panel_6.setBounds(318, 156, 68, 52);
		contentPane.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.ORANGE);
		panel_7.setBounds(258, 156, 60, 52);
		contentPane.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.GREEN);
		panel_8.setBounds(189, 156, 68, 52);
		contentPane.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.ORANGE);
		panel_9.setBounds(129, 156, 60, 52);
		contentPane.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.GREEN);
		panel_10.setBounds(60, 156, 68, 52);
		contentPane.add(panel_10);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.ORANGE);
		panel_11.setBounds(0, 156, 60, 52);
		contentPane.add(panel_11);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.GREEN);
		panel_12.setBounds(0, 210, 68, 52);
		contentPane.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.ORANGE);
		panel_13.setBounds(68, 210, 60, 52);
		contentPane.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.GREEN);
		panel_14.setBounds(129, 210, 68, 52);
		contentPane.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.ORANGE);
		panel_15.setBounds(197, 210, 60, 52);
		contentPane.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.GREEN);
		panel_16.setBounds(258, 210, 68, 52);
		contentPane.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.ORANGE);
		panel_17.setBounds(326, 210, 60, 52);
		contentPane.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(Color.GREEN);
		panel_18.setBounds(318, 261, 68, 52);
		contentPane.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(Color.ORANGE);
		panel_19.setBounds(258, 261, 60, 52);
		contentPane.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(Color.GREEN);
		panel_20.setBounds(189, 261, 68, 52);
		contentPane.add(panel_20);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(Color.ORANGE);
		panel_21.setBounds(129, 261, 60, 52);
		contentPane.add(panel_21);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(Color.GREEN);
		panel_22.setBounds(60, 261, 68, 52);
		contentPane.add(panel_22);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(Color.ORANGE);
		panel_23.setBounds(0, 261, 60, 52);
		contentPane.add(panel_23);
	}
}
