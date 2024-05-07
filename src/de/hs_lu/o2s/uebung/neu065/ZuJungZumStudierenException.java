package de.hs_lu.o2s.uebung.neu065;

public class ZuJungZumStudierenException extends ZuJungException {

	public ZuJungZumStudierenException() {
		super("Person ist zu jung zum Studieren");
	}
	
	public ZuJungZumStudierenException(String msg) {
		super(msg);
	}
}
