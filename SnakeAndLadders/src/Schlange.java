
public class Schlange {
	private int yPos;
	private int xPos;
	private String kopfEnde;

	public Schlange(int yPos, int xPos, String kopfEnde) {
		super();
		this.yPos = yPos;
		this.xPos = xPos;
		this.kopfEnde = kopfEnde;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public String getKopfEnde() {
		return kopfEnde;
	}

	public void setKopfEnde(String kopfEnde) {
		this.kopfEnde = kopfEnde;
	}
}
