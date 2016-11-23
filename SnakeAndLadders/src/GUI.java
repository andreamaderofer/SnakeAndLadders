import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class GUI extends JFrame {
	private SpielfeldEinlesen se = new SpielfeldEinlesen();

	public GUI(int i) {

		se.einlesen(i);
		erstellen(se.getSpielfeld());
	}

	public void erstellen(String[][] spielfeld) {
		JPanel[][] labelfeld = new JPanel[324][324];
		for (int i = 0; i < spielfeld.length; i++) {
			for (int a = 0; a < spielfeld.length; a++) {

				if (spielfeld[i][a] == null) {
					break;
				}
				// System.out.println(spielfeld[i][a]);
				if (spielfeld[i][a].equals("BB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setToolTipText("HALLO");
					labelfeld[i][a].setBackground(Color.blue);
					ImageIcon im=new ImageIcon("schlangen1.png");
					Image imag=im.getImage();
					Image ima=imag.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH);  
					labelfeld[i][a].setSize(50,50);
					labelfeld[i][a].add(new JLabel(new ImageIcon(ima)));
					continue;
				}
				if (spielfeld[i][a].equals("BW")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setToolTipText("HALLO");
					labelfeld[i][a].setBackground(Color.black);
					continue;
				}
				if (spielfeld[i][a].equals("TB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setToolTipText("HALLO");
					labelfeld[i][a].setBackground(Color.CYAN);
					continue;
				}
				if (spielfeld[i][a].equals("AA")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setToolTipText("HALLO");
					labelfeld[i][a].setBackground(Color.green);
					labelfeld[i][a].setSize(50,50);
					continue;
				} else {
					labelfeld[i][a] = new JPanel();
					continue;
				}
			}
		}

		JFrame frame = new JFrame();
		frame.getContentPane();
		frame.setSize(500, 500);
		frame.getContentPane().setBounds(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_HORIZ, MAXIMIZED_VERT);
		GridLayout gri=new GridLayout(10,10);
		frame.getContentPane().setLayout(gri);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.orange);
		
		for (int i = 0; i < labelfeld.length; i++) {
			for (int a = 0; a < labelfeld.length; a++) {
				if (labelfeld[i][a] == null) {
					break;
				} else {
					frame.getContentPane().add(labelfeld[i][a]);
				}
			}
		}
		frame.setVisible(true);
	}

	public void aktualisieren() {

	}

	public void textdateieinlesen(int spielfeldnummer) {

		/*
		 * 
		 * herausgelesene Positionen in Schlange/Leitern setten
		 */
	}

}