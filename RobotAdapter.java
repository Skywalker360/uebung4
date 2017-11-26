public class RobotAdapter extends Robot implements Spieler {

	/**
	 * Dies ist der Adapter f�r den Roboter. Ein Adapter scheint an dieser Stelle am sinnvollsten, da der Roboter ins Spiel integriet werden soll, aber
	 * abge�nderte Funktionen und Werte bietet. Diese Werte m�ssen irgendwie angepasst werden, damit die der Roboter im Spiel ohne Probleme funktioniert.
	 * Zun�chst muss der Adapter daf�r alle Eigenschaften eines Roboters erben. Anschlie�end wird das Interface Spieler implementiert, da dieses f�r jede
	 * Figur im Spiel implementiert werden muss. Der Konstruktor ist praktisch der Selbe wie f�r den Roboter, weswegen eine einfacher Super-Konstruktor reicht.
	 * 
	 */
	
	public RobotAdapter() {
		super();
	}
	
	/**
	 * Der Roboter hat �hnliche Attribute wie der Mensch. Es gibt nur zwei Unterschiede. Zum einen sind die Attribute private, nicht public. Zum anderen haben
	 * die Attribute des Roboters den Datentyp Double, nicht Integer. Die Attribute werden nur �ber die Methoden des Interfaces ge�ndert, weswegen es die
	 * Sichtbarkeit kein gro�es Problem ist. Mit der Methode rolleNach() kann man die Attribute in den Methoden des Interfaces einfach �ndern. Der jeweilige 
	 * Wert, der angepasst werden soll, wird zuvor aber noch um den Wert distanz ge�ndert. Die R�ckgabe erfolgt dann durch Ausf�hren der getter, wobei ein (int)
	 * davor steht, damit die Position als Integer zur�ckgegeben wird. Die Zahlen hinter dem Komma sind nicht von Bedeutung, da das ganze System auf Integer
	 * aufbaut, was daran zu erkennen ist, dass die selbsterstellte Klasse Human nur Integer zur�ckgibt. Das Streichen der Zahlen nach dem Komma ist also kein
	 * Problem. Des Weiteren sind die Standardwerte der Attribute sowieso 0, was hei�t, dass sie nur �ber die Methoden des Interfaces einen anderen Wert haben
	 * k�nnen und dadurch, dass die �nderungen immer Integer sind, k�nnen die Attribute des RoboterAdapter niemals Nachkommazahlen haben, da immer nur Integer
	 * f�r eine �nderung der Position der Figur im Spiel verwendet werden. Somit ist das Streichen absolut keine Gefahr, da die Double-Zahlen sowieso immer
	 * ganzzahlig wie Integer sind.
	 */
	
	public int geheNachLinks(int distanz) {
		 this.rolleNach(getX() - distanz, getY());;
	return (int) this.getX();
	}

	public int geheNachRechts(int distanz) {
		this.rolleNach(getX() + distanz, getY());
	return (int) this.getX();
	}

	public int geheNachOben(int distanz) {
		this.rolleNach(getX(), getY() + distanz);
	return (int) this.getY();
	}

	public int geheNachUnten(int distanz) {
		this.rolleNach(getX(), getY() + distanz);
	return (int) this.getY();
	}

	
}
