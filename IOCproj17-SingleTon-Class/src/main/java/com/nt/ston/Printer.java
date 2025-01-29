package com.nt.ston;

public class Printer {
	// static reference variable
	private static Printer INSTANCE;

    // private Constructor
	private Printer() {
		System.out.println("Printer:: 0-param Constructor.");
	}

  // public static factory method having single ton logic
	public static Printer getInstance() {
		 // single ton logic 
		if (INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
}
