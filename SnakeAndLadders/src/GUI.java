import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class GUI extends JFrame implements ActionListener {
	private SpielfeldEinlesen se = new SpielfeldEinlesen();
	private String[][] spielfeld;
	private int feld = 1;
	private JPanel pan = new JPanel();
	private ArrayList<Schlange> schlangen = new ArrayList<Schlange>();
	private ArrayList<Leiter> leitern = new ArrayList<Leiter>();
	private Schlange schlange;
	private Leiter leiter;
	private int spielzugv = 0;
	private Spieler spieler1 = new Spieler(0, 0); // spieler steht links oben am
													// Feld
	private Spieler spieler2 = new Spieler(0, 0);
	private boolean spielEnde = false;
	private JLabel labelSp1 = new JLabel("SP1");
	private JLabel labelSp2 = new JLabel("SP2");
	private JFrame frame;
	private JPanel[][] labelfeld;

	public GUI(int i) {

		se.einlesen(i);
		try {
			erstellen(se.getSpielfeld());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
	}
	
	//zum Zeichnen der Schlangen als blaue Linien
	private class Ladder extends JPanel {
		int feld = 0;
		int x = 0;
		int y = 0;
		int endex = 0;
		int endey = 0;

		public Ladder(int feld, int x, int y, int endex, int endey) {
			this.feld = feld;
			this.x = x;
			this.y = y;
			this.endex = endex;
			this.endey = endey;
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.blue);
			g.drawLine(x, y, endex, endey);
			this.setBackground(Color.LIGHT_GRAY);
			this.setBorder(BorderFactory.createLineBorder(Color.black));
			g.setColor(Color.BLACK);
			if(this.getInsets().equals(labelSp1)){
				labelSp1.setForeground(Color.RED);
				this.add(labelSp1);
				repaint();
			}
			g.drawString("" + feld, 20, 20);
		}
	}
	
	//zum Zeichnen der Schlangen als Rote Linien
	private class Snake extends JPanel {
		int feld = 0;
		int x = 0;
		int y = 0;
		int endex = 0;
		int endey = 0;

		public Snake(int feld, int x, int y, int endex, int endey) {
			this.feld = feld;
			this.x = x;
			this.y = y;
			this.endex = endex;
			this.endey = endey;
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.red);
			g.drawLine(x, y, endex, endey);
			this.setBackground(Color.LIGHT_GRAY);
			this.setBorder(BorderFactory.createLineBorder(Color.black));
			if(this.getInsets().equals(labelSp1)){
				labelSp1.setForeground(Color.RED);
				this.add(labelSp1);
				repaint();
			}
			g.setColor(Color.BLACK);
			g.drawString("" + feld, 20, 20);
		}
	}

	public void erstellen(String[][] spielfeld) throws InterruptedException {
		this.spielfeld = spielfeld;
		frame = new JFrame();
		frame.getContentPane();
		frame.setSize(500, 600);
		frame.getContentPane().setBounds(MAXIMIZED_BOTH, MAXIMIZED_BOTH, MAXIMIZED_HORIZ, MAXIMIZED_VERT);
		frame.getContentPane().setLayout(new BorderLayout());
		GridLayout gri = new GridLayout(11, 11);
		labelSp1.setSize(20, 20);
		labelSp2.setSize(20, 20);
		pan.setLayout(gri);
		frame.getContentPane().add(pan, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.orange);
		labelfeld = new JPanel[spielfeld.length][spielfeld.length];
		for (int i = 0; i < spielfeld.length - 1; i++) {
			for (int a = 0; a < spielfeld.length - 1; a++) {

				if (spielfeld[i][a] == null) {
					break;
				}

				// leiter rechts
				if (spielfeld[i][a].contains("LRU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Ladder(feld, 25, 25, 100, 100)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					leiter = new Leiter(i, a, spielfeld[i][a]);
					leitern.add(leiter);
					continue;
				}

				if (spielfeld[i][a].contains("LRB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Ladder(feld, 0, 0, 100, 100)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					continue;
				}

				if (spielfeld[i][a].contains("LRO")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Ladder(feld, 0, 0, 25, 25)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					leiter = new Leiter(i, a, spielfeld[i][a]);
					leitern.add(leiter);
					continue;
				}
				// leiter links
				if (spielfeld[i][a].contains("LLU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Ladder(feld, 50, 0, 0, 50)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					leiter = new Leiter(i, a, spielfeld[i][a]);
					leitern.add(leiter);
					continue;
				}

				if (spielfeld[i][a].contains("LLO")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Ladder(feld, 50, 0, 0, 50)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					leiter = new Leiter(i, a, spielfeld[i][a]);
					leitern.add(leiter);
					continue;
				}

				if (spielfeld[i][a].contains("LLB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Ladder(feld, 50, 0, 0, 50)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					continue;
				}

				// schlangen rechts
				if (spielfeld[i][a].contains("SRU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld, 25, 25, 100, 100)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					schlange = new Schlange(i, a, spielfeld[i][a]);
					schlangen.add(schlange);
					continue;
				}

				if (spielfeld[i][a].contains("SRB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld, 0, 0, 100, 100)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					continue;
				}

				if (spielfeld[i][a].contains("SRK")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld, 0, 0, 25, 25)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					schlange = new Schlange(i, a, spielfeld[i][a]);
					schlangen.add(schlange);
					continue;
				}

				// schlane links
				if (spielfeld[i][a].contains("SLU")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld, 50, 0, 0, 50)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					schlange = new Schlange(i, a, spielfeld[i][a]);
					schlangen.add(schlange);
					continue;
				}

				if (spielfeld[i][a].contains("SLK")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld, 50, 0, 0, 50)));
					schlange = new Schlange(i, a, spielfeld[i][a]);
					schlangen.add(schlange);					
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					continue;
				}

				if (spielfeld[i][a].contains("SLB")) {
					labelfeld[i][a] = new JPanel();
					labelfeld[i][a].setSize(50, 50);
					pan.add(labelfeld[i][a].add(new Snake(feld, 50, 0, 0, 50)));
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					feld++;
					continue;
				}

				// für die anderen Felder
				if (spielfeld[i][a].contains("AAA")) {
					labelfeld[i][a] = new JPanel();
					JLabel lab = new JLabel("" + feld);
					labelfeld[i][a].add(lab);
					labelfeld[i][a].setBackground(Color.LIGHT_GRAY);
					labelfeld[i][a].setSize(50, 50);
					labelfeld[i][a].setBorder(BorderFactory.createLineBorder(Color.black));
					pan.add(labelfeld[i][a]);
					feld++;
					continue;
				}
			}
		}
		JButton wuefel = new JButton("Wuerfel");
		wuefel.addActionListener(this);
		frame.getContentPane().add(wuefel, BorderLayout.SOUTH);
		frame.setVisible(true);
		repaint();
	}

	int ergebnis = 0;
	boolean ersterZug=false;
	
	public void actionPerformed(ActionEvent e) {
		ergebnis = wuerfeln()-1;
		System.out.println(ergebnis);
		aktualisieren();
	}

	public void aktualisieren() {
		int differenz=0;
		if(ersterZug){
			spieler1.setPosition(0, 0);
			ersterZug=true;
		}
		labelSp1.setForeground(Color.RED);
		if(spieler1.getX()+ergebnis<10){
			labelfeld[spieler1.getY()][spieler1.getX()+ergebnis].add(labelSp1);
			spieler1.setX(spieler1.getX()+ergebnis);
		}else{
			differenz=spieler1.getX();
			System.out.println();
			labelfeld[spieler1.getY()+1][spieler1.getX()].add(labelSp1);
			spieler1.setX(spieler1.getX()+ergebnis);
			spieler1.setY(spieler1.getY()+1);
		}

		pan.repaint();
		pan.repaint();
	}

	public void textdateieinlesen(int spielfeldnummer) {
		/*
		 * 
		 * herausgelesene Positionen in Schlange/Leitern setten
		 */
	}

	public int wuerfeln() {
		int augenzahl = (int) ((Math.random() * 6) + 1);
		return augenzahl;
	}

	public void spielzug() {

		do {
			if (spielzugv % 2 == 0) {
				spieler1.isActive(true);
				spieler2.isActive(false);
			} else {
				spieler1.isActive(false);
				spieler2.isActive(true);
			}

			spielzugv++;
		} while (!spielEnde);
		wuerfeln();

	}

	public void spielBeendet() {

		if (spieler1.getX() >= 10 && spieler1.getY() >= 10) {

		}
	}

}