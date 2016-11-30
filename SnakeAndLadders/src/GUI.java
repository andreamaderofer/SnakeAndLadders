import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;

public class GUI extends JFrame {
	private SpielfeldEinlesen se = new SpielfeldEinlesen();
	
	public GUI(int i) {

		se.einlesen(i);
		erstellen(se.getSpielfeld());
		repaint();
	}
	
    public class MyDraw extends JPanel {
        public void paintComponent(Graphics g) {
           super.paintComponent(g);
           g.drawLine(0, 0, 200, 200);
        }
    }
	
	public void erstellen(String[][] spielfeld) {

		JFrame frame = new JFrame();
		frame.getContentPane();
		frame.setSize(500, 500);
		frame.getContentPane().setBounds(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_HORIZ, MAXIMIZED_VERT);
		GridLayout gri=new GridLayout(10,10);
		frame.getContentPane().setLayout(gri);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.orange);
		int feld=1;
		JPanel[][] labelfeld = new JPanel[spielfeld.length][spielfeld.length];
		for (int i = 100; i >=0; i--) {
			for (int a = 0; a < spielfeld.length; a++) {
				
				if (spielfeld[i][a] == null) {
					break;
				}

				if (spielfeld[i][a].equals("BB")) {
					labelfeld[i][a] = new JPanel();
					JLabel lab=new JLabel(""+feld);
					labelfeld[i][a].add(lab);
					labelfeld[i][a].setBackground(Color.blue); 
					labelfeld[i][a].setSize(50,50);
					frame.getContentPane().add(labelfeld[i][a].add(new MyDraw()));					
					feld++;
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
					JLabel lab=new JLabel(""+feld);
					labelfeld[i][a].add(lab);
					labelfeld[i][a].setBackground(Color.LIGHT_GRAY);
					labelfeld[i][a].setSize(50,50);
					frame.getContentPane().add(labelfeld[i][a]);
					feld++;
					continue;
				} else {
					labelfeld[i][a] = new JPanel();
					feld++;
					continue;
				}
			}
		}
		
		/*for (int i = 0; i < labelfeld.length; i++) {
			for (int a = 0; a < labelfeld.length; a++) {
				if (labelfeld[i][a] == null) {
					break;
				} else {
					if(i%5==0 && a%5==0){
						frame.getContentPane().add(labelfeld[i][a].add(new MyDraw()));
					}else{
						frame.getContentPane().add(labelfeld[i][a]);						
					}
				}
			}
		}*/
		frame.setVisible(true);
		repaint();
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