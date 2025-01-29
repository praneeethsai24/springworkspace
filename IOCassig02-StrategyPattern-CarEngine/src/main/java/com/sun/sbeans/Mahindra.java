package com.sun.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mah")
public class Mahindra {
	@Autowired
	private Engine engine;

	public Mahindra() {
		System.out.println("Mahindra: 0-param constructor");
	}

	// b.method
	public String booking(double taxs[], String colours[]) {
		double taxTol = 0.0;
		for (double p : taxs)
			taxTol = taxTol + p;
		int num = new Random().nextInt(10000);
		String msg = engine.suv(num);
		return Arrays.toString(taxs) + " are been collected for specific " + Arrays.toString(colours)
				+ " and the total amount is" + taxTol + msg;
	}
}
