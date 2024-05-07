package de.hs_lu.o2s.uebung.neu065;

public class Disco extends Gewerbebetrieb implements Unterhaltend, Comparable<Unterhaltend> {

	/**
	 * Anzahl der Personen, die in die Disko passen
	 */
	private int anzahlPersonen;
	
	/**
	 * Konstruktor für Diskotheken
	 * @param anzahlPersonen Anzahl Personen, die in die Disko passen
	 */
	public Disco(int anzahlPersonen) {
		super();
		this.anzahlPersonen = anzahlPersonen;
	}
	
	/**
	 * Getter für Anzahl Personen
	 * @return
	 */
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}

	/**
	 * Setter für Anzahl Personen
	 * @param anzahlPersonen
	 */
	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}

	@Override
	public int getUnterhaltungswert() {
		return this.getAnzahlPersonen();
	}
	
	public String toString(){
		return "Disco für " + this.getAnzahlPersonen() + " Gäste " +
				"mit Unterhaltungswert " + this.getUnterhaltungswert();
	}

	@Override
	public int compareTo(Unterhaltend o) {
		return this.getUnterhaltungswert() - o.getUnterhaltungswert();
	}
	
//	-----------------------------------------------------------------------------------------Methoden
	
	public void pruefeGast(Person pers) throws ZuJungException {
		if(pers.getGeburtsjahr()>2000) {
			throw new ZuJungException();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

