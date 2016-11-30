import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class GUI extends JFrame implements ActionListener {
	private SpielfeldEinlesen se = new SpielfeldEinlesen();
	private int feld = 1;
	private JPanel pan=new JPanel();
	
	public GUI(int i) {

		se.einlesen(i);
		erstellen(se.getSpielfeld());
		repaint();
	}

	private class Leiter extends JPanel {
		int feld=0;
		int x=0;
		int y=0;
		int endex=0;
		int endey=0;
		public Leiter(int feld, int x, int y, int endex, int endey) {
			this.feld=feld;
			this.x=x;
			this.y=y;
			this.endex=endex;
			this.endey=endey;
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawLine(x, y, endex, endey);
			this.setBackground(Color.LIGHT_GRAY);
			g.setColor(Color.BLACK);
			g.drawString(""+feld,20, 20);
		}
	}

	private class Snake extends JPanel {
		int feld=0;
		int x=0;
		int y=0;
		int endex=0;
		int endey=0;
		public Snake(int feld, int x, int y, int endex, int endey) {
			this.feld=feld;
			this.x=x;
			this.y=y;
			this.endex=endex;
			this.endey=endey;
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawLine(x, y, endex, endey);
			this.setBackground(Color.LIGHT_GRAY);
			g.setColor(Color.BLACK);
			g.drawString(""+feld,20, 20);
		}
	}

	public void erstellen(String[][] spielfeld) {

		JFrame frame = new JFrame();
		frame.getContentPane();
		frame.setSize(500, 600);
		frame.getContentPane().setBounds(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_HORIZ, MAXIMIZED_VERT);
		frame.getContentPane().setLayout(new BorderLayout());
		GridLayout gri = new GridLayout(11, 11);
		pan.setLayout(gri);
		frame.getContentPane().add(pan,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.orange);
		JPanel[][] labelfeld = new JPanel[spielfeld.length][spielfeld.length];
		for (int i = 0; i < spielfeld.length - 1; i++) {
			for (int a = 0; a < spielfeld.length - 1; a++) {

				if (spielfeld[i][a] == null) {
					break;
				}
				
				//leiter rechts
				if (spielfeld[i][a].equals("LRU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Leiter(feld, 25, 25,100,100)));
					feld++;
					continue;
				}

				if (spielfeld[i][a].equals("LRB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Leiter(feld,0,0,100,100)));
					feld++;
					continue;
				}

				if (spielfeld[i][a].equals("LRO")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Leiter(feld,0,0,25,25)));
					feld++;
					continue;
				}
				//leiter links
				if (spielfeld[i][a].equals("LLU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Leiter(feld,50,0,0,50)));
					feld++;
					continue;
				}
				
				if (spielfeld[i][a].equals("LLO")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Leiter(feld,50,0,0,50)));
					feld++;
					continue;
				}
				
				if (spielfeld[i][a].equals("LLB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Leiter(feld,50,0,0,50)));
					feld++;
					continue;
				}
				
				// schlangen rechts
				if (spielfeld[i][a].equals("SRU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld,25,25,100,100)));
					feld++;
					continue;
				}

				if (spielfeld[i][a].equals("SRB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld,0,0,100,100)));
					feld++;
					continue;
				}

				if (spielfeld[i][a].equals("SRK")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld,0,0,25,25)));
					feld++;
					continue;
				}
				
				//schlane links
				if (spielfeld[i][a].equals("SLU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld,50,0,0,50)));
					feld++;
					continue;
				}
				
				if (spielfeld[i][a].equals("SLK")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld,50,0,0,50)));
					feld++;
					continue;
				}
				
				if (spielfeld[i][a].equals("SLB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld,50,0,0,50)));
					feld++;
					continue;
				}
				
				//für die anderen Felder
				if (spielfeld[i][a].equals("AAA")) {
					labelfeld[i][a] = new JPanel();
					JLabel lab = new JLabel("" + feld);
					labelfeld[i][a].add(lab);
					labelfeld[i][a].setBackground(Color.LIGHT_GRAY);
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a]);
					feld++;
					continue;
				}
			}
		}
		JButton wuefel=new JButton("Wuerfel");
		wuefel.addActionListener(this);
		frame.getContentPane().add(wuefel,BorderLayout.SOUTH);
		frame.setVisible(true);
		repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
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