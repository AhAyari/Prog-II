package de.hs_lu.o2s.uebung.neu065;

public class StudentAgeChecked extends Student {

	public StudentAgeChecked(String name, int geburtsjahr) throws ZuJungZumStudierenException {
		super(name, geburtsjahr);
		if(geburtsjahr>2006) {
			throw new ZuJungZumStudierenException();
		}
	}
	
	public StudentAgeChecked(String name, int geburtsjahr, String matrNr) throws ZuJungZumStudierenException {
		this(name, geburtsjahr);
		this.setMatrNr(matrNr);
	}
	
	
}
