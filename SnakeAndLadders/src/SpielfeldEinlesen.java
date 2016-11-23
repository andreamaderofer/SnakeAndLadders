import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SpielfeldEinlesen {

	private String[][] arr = new String[324][324];

	// JDBC verbindung derzeit noch nicht
	public void einlesen(int nr) {
		BufferedReader rd = null;
		String zeile = null;
		String[] teile = null;
		int zeilenZahl = 0;
		try {
			rd = new BufferedReader(new FileReader("Spielfeld" + nr + ".txt"));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			while ((zeile = rd.readLine()) != null) {
				System.out.println(zeile);
				teile = zeile.split(";");
				for (int i = 0; i < teile.length; i++) {
					arr[zeilenZahl][i] = teile[i];
				}
				zeilenZahl++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// gibt das ausgew�hlte Spielfeld zur�ck
	public String[][] getSpielfeld() {
		return arr;
	}
}
