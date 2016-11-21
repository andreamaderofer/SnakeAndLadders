import javax.swing.*;

public class GUI extends JFrame{
	private SpielfeldEinlesen se=new SpielfeldEinlesen();
	public GUI() {
		
		se.einlesen(1);
	}

	public void erstellen() {
		String spielfeld[][]=se.getSpielfeld();
		JButton[][] buttonfeld=new JButton[19][19];
		for(int i=0;i<spielfeld.length;i++){
			for(int a=0;a<spielfeld.length;a++){
				buttonfeld[i][a]=new JButton("HALLO");
			}
		}
	}

	public void aktualisieren() {
		
	}
}