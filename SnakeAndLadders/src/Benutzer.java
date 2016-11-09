import java.awt.Color;

public class Benutzer {
	
	String name;
	String passwort;
	Color color; //farbe mit der der Benutzer spielt, kann entweder aus 
	//Datenbank entnommen werden oder jedes mal mit JColorChooser neu gewählt werden.

	public Benutzer(String name, String passwort, Color color){
		
		this.name = name;
		this.passwort = passwort;
		this.color = color;
		
	}

}
