import java.awt.Color;

public class Spieler {

	/*
	 * 
	 * Bewegen und neue Position abspeichern
	 */

	private int x;
	private int y;
	private Benutzer b = new Benutzer();

	public Spieler(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setPosition(int y, int x) {
		this.y = y;
		this.x = x;
	}

	public boolean isActive(boolean x) {
		return x;
	}

	public void setColor(Color col) {

		if (b.getColor() == col) {

		}
	}

}