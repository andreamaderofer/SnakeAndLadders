
public class Leiter {
	private int xPos;
	private int yPos;
	private String obenUnten;

	public Leiter(int xPos, int yPos, String obenUnten) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.obenUnten = obenUnten;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public String getObenUnten() {
		return obenUnten;
	}

	public void setObenUnten(String obenUnten) {
		this.obenUnten = obenUnten;
	}
}
