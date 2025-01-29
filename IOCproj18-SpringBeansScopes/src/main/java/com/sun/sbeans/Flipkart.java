package com.sun.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fpkt")
@Scope("singleton")
public class Flipkart {
	@Autowired
	private Courier courier;

	public Flipkart() {
		System.out.println("flipkart: constructor");
	}

//	public void setCourier(Courier courier) {
//		this.courier = courier;
//	} no need in spring

	// b.method
	public String shopping(String items[], double prices[]) {
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
