package de.hs_lu.o2s.uebung.neu065;

public class AppAlter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Disco disco1 = new Disco (500);
		
		System.out.println("Versuche einen Studenten mit Geburtsjahr 2007 anzulegen und prüfe, ob er in die Disco kommt.");
		try {
			StudentAgeChecked studAC1 = new StudentAgeChecked("Master Mischa", 2007);
			Student stud1 = studAC1;
			System.out.println(stud1.getName()+" darf studieren");
			try {
				disco1.pruefeGast(stud1);
				System.out.println(stud1.getName()+" darf in die Disco");
			}catch(ZuJungException zje) {
				System.out.println(zje.getMessage());
			}
		}catch(ZuJungZumStudierenException zjs) {
			System.out.println(zjs.getMessage());
		}
		
		System.out.println("\nVersuche einen Studenten mit Geburtsjahr 2001 anzulegen und prüfe, ob er in die Disco kommt.");
		try {
			StudentAgeChecked studAC2 = new StudentAgeChecked("Julia", 2001);
			Student stud2 = studAC2;
			System.out.println(stud2.getName()+" darf studieren");
			try {
				disco1.pruefeGast(stud2);
				System.out.println(stud2.getName()+" darf in die Disco");
			}catch(ZuJungException zje) {
				System.out.println(zje.getMessage());
			}
		}catch(ZuJungZumStudierenException zjs) {
			System.out.println(zjs.getMessage());
		}
		
		System.out.println("\nVersuche einen Studenten mit Geburtsjahr 1998 anzulegen und prüfe, ob er in die Disco kommt.");
		try {
			StudentAgeChecked studAC3 = new StudentAgeChecked("Hendrik", 1998);
			Student stud3 = studAC3;
			System.out.println(stud3.getName()+" darf studieren");
			try {
				disco1.pruefeGast(stud3);
				System.out.println(stud3.getName()+" darf in die Disco");
			}catch(ZuJungException zje) {
				System.out.println(zje.getMessage());
			}
		}catch(ZuJungZumStudierenException zjs) {
			System.out.println(zjs.getMessage());
		}
		
		
		
		

	}

}
