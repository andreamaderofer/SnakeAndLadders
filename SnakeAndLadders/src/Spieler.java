
public class Spieler {
	
	/*
	 * 
	 * Bewegen und neue Position abspeichern
	 */
	
	int x;
	int y;
	
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

}
