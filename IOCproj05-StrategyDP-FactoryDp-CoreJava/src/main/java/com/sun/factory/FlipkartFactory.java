package com.sun.factory;

import com.sun.comps.BlueDart;
import com.sun.comps.DTDC;
import com.sun.comps.DHL;
import com.sun.comps.Flipkart;
import com.sun.comps.Courier;

public class FlipkartFactory {
	// static factory method having logic to create flipkart object having the given
	// courier object
	public static Flipkart getInstance(String courierType) {
		// create dependent class obj
		Courier courier = null;
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else if (courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else
			throw new IllegalArgumentException("invalid CourierType");
		// create target class object
		Flipkart fpkt = new Flipkart();
		// assign dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}

}
