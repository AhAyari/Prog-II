package de.hs_lu.o2s.uebung.neu065;

import junit.framework.TestCase;

public class TestZuJungExceptions extends TestCase {
	
	public void testZuJungExceptionGeworfenDisco(){
		
		Disco myDisco = new Disco(500); // eine Disco mit max. 500 Personen anlegen
		
		Person pers1 = new Person("Günter", 1997);
				
		try {
			myDisco.pruefeGast(pers1);
			assertTrue("Korrekt, pers1 hat Zutritt zu myDisco", true);
		} catch (ZuJungException e) {
			assertTrue("Falsch, pers1 hat Zutritt zu myDisco, es wird aber eine ZuJungException geworfen", false);
		} catch (Exception e) {
			assertTrue("Falsch, pers1 hat Zutritt zu myDisco, es wird aber eine allgemeine Exception geworfen", false);
		}
		
		
		Person pers2 = new Person("Eric", 2001);
		
		try {
			myDisco.pruefeGast(pers2);
			assertTrue("Falsch, pers2 darf keinen Zutritt zu myDisco haben", false);
		} catch (ZuJungException e) {
			assertTrue("Korrekt, pers2 hat keine Zutritt zu myDisco und es wird die ZuJungException geworfen", true);
			assertEquals("Die Fehlermeldung stimmt nicht", "Person ist zu jung", e.getMessage());
		} catch (Exception e) {
			assertTrue("Falsch, es wird zwar eine Exception geworfen, aber es sollte die ZuJungException kommen, wenn pers2 in myDisco m�chte", false);
		}
		
	}
	
	
	public void testZuJungExceptionGeworfenStudent(){
						
		try {
			Student stud1 = new StudentAgeChecked("Martin", 2007);
			assertTrue("Falsch, stud1 darf nicht angelegt werden", false);
		} catch (ZuJungZumStudierenException zje) {
			assertTrue("Korrekt, stud1 darf nicht angelegt werden und es wird stattdessen die ZuJungZumStudierenException geworfen", true);
			assertEquals("Die Fehlermeldung stimmt nicht", "Person ist zu jung zum Studieren", zje.getMessage());
		} catch (ZuJungException e) {
			assertTrue("Falsch, es wird zwar die ZuJungException geworfen, aber es sollte die ZuJungZumStudierenException kommen", false);
		} catch (Exception e) {
			assertTrue("Falsch, es wird zwar eine Exception geworfen, aber es sollte die ZuJungZumStudierenException kommen", false);
		}		
		
	}
	
	public void testZuJungExceptionGeworfenStudentMitMatrnr(){
		
		try {
			Student stud1 = new StudentAgeChecked("Martin", 2007, "111111");
			assertTrue("Falsch, stud1 darf nicht angelegt werden", false);
		} catch (ZuJungZumStudierenException zje) {
			assertTrue("Korrekt, stud1 darf nicht angelegt werden und es wird stattdessen die ZuJungZumStudierenException geworfen", true);
			assertEquals("Die Fehlermeldung stimmt nicht", "Person ist zu jung zum Studieren", zje.getMessage());
		} catch (ZuJungException zje) {
			assertTrue("Falsch, es wird zwar die ZuJungException geworfen, aber es sollte die ZuJungZumStudierenException kommen", false);
		} catch (Exception e) {
			assertTrue("Falsch, es wird zwar eine Exception geworfen, aber es sollte die ZuJungException kommen", false);
		}		
		
	}
		
}
