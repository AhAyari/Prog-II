package de.hs_lu.o2s.uebung.neu065;

import java.io.IOException;

public class ZuJungException extends IOException {
	
	public ZuJungException() {
		super("Person ist zu jung");
	}
	
	public ZuJungException(String msg) {
		super(msg);
	}

}
