public class RobotAdapter extends Robot implements Spieler {

	/**
	 * Dies ist der Adapter für den Roboter. Ein Adapter scheint an dieser Stelle am sinnvollsten, da der Roboter ins Spiel integriet werden soll, aber
	 * abgeänderte Funktionen und Werte bietet. Diese Werte müssen irgendwie angepasst werden, damit die der Roboter im Spiel ohne Probleme funktioniert.
	 * Zunächst muss der Adapter dafür alle Eigenschaften eines Roboters erben. Anschließend wird das Interface Spieler implementiert, da dieses für jede
	 * Figur im Spiel implementiert werden muss. Der Konstruktor ist praktisch der Selbe wie für den Roboter, weswegen eine einfacher Super-Konstruktor reicht.
	 * 
	 */
	
	public RobotAdapter() {
		super();
	}
	
	/**
	 * Der Roboter hat ähnliche Attribute wie der Mensch. Es gibt nur zwei Unterschiede. Zum einen sind die Attribute private, nicht public. Zum anderen haben
	 * die Attribute des Roboters den Datentyp Double, nicht Integer. Die Attribute werden nur über die Methoden des Interfaces geändert, weswegen es die
	 * Sichtbarkeit kein großes Problem ist. Mit der Methode rolleNach() kann man die Attribute in den Methoden des Interfaces einfach ändern. Der jeweilige 
	 * Wert, der angepasst werden soll, wird zuvor aber noch um den Wert distanz geändert. Die Rückgabe erfolgt dann durch Ausführen der getter, wobei ein (int)
	 * davor steht, damit die Position als Integer zurückgegeben wird. Die Zahlen hinter dem Komma sind nicht von Bedeutung, da das ganze System auf Integer
	 * aufbaut, was daran zu erkennen ist, dass die selbsterstellte Klasse Human nur Integer zurückgibt. Das Streichen der Zahlen nach dem Komma ist also kein
	 * Problem. Des Weiteren sind die Standardwerte der Attribute sowieso 0, was heißt, dass sie nur über die Methoden des Interfaces einen anderen Wert haben
	 * können und dadurch, dass die Änderungen immer Integer sind, können die Attribute des RoboterAdapter niemals Nachkommazahlen haben, da immer nur Integer
	 * für eine Änderung der Position der Figur im Spiel verwendet werden. Somit ist das Streichen absolut keine Gefahr, da die Double-Zahlen sowieso immer
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
