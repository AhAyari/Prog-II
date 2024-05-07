package de.hs_lu.o2s.uebung.neu065;

public class Student extends Person {
	/**
	 * Matrikelnummer
	 */
	private String matrNr;
	
	
	/**
	 * Studiengebühr
	 */
	private static double studiengebuehr = 500.0;
	
	/**
	 * Anzahl Studiensemester
	 */
	private int studiensemester;
	
	public static double getStudiengebuehr() {
		return studiengebuehr;
	}
	
	public double getGesamtgebuehr() {
		return this.studiensemester * studiengebuehr;
	}
	
	public Student(String name) {
		super(name);		
	}
	
	public Student(String name, int geburtsjahr) {
		super(name, geburtsjahr);		
	}
	
	
	public Student(String name, String matrNr, int studiensemester) {
		this(name, studiensemester);
		this.matrNr = matrNr;
	}
	
	public Student(String name, String matrNr){
		super(name);
		this.matrNr = matrNr;
		System.out.println("Student(String, String) wird ausgeführt"); 
	}
	
	
	public Student(String name, int geburtsjahr, String matrNr){
		super(name, geburtsjahr);  
		this.matrNr = matrNr;
	}
			
	/**
	 * @return Matrikelnummer des Studenten
	 */
	public String getMatrNr() {
		return matrNr;
	}
	
	/**
	 * Setzen der Matrikelnummer
	 * @param matrNr neue Matrikelnummer
	 */
	public void setMatrNr(String matrNr) {
		this.matrNr = matrNr;
	}
	
	public String toString(){
		return super.toString() +
							", Matrikelnummer: " + this.getMatrNr();
	
	}
}




