package com.sun.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier;

	public Flipkart() {
		System.out.println("flipkart: constructor");
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	// b.method
	public String shopping(String items[],double prices[]) {
		// calculate bill amount
		double total = 0.0;
		for (double p : prices)
			total += p;
		// generate random number as orderid
		int oid = new Random().nextInt(1000);
		// use courier
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + "are purchased having prices" + Arrays.toString(prices) + ", bill amount:"
				+ total + msg;
	}
}
