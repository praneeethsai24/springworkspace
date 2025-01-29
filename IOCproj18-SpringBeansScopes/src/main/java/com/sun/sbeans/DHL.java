package com.sun.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dhl")
@Primary
public final class DHL implements Courier {

	public DHL() {
		System.out.println("DHL: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {

		return "order id " + oid + " order is set for delievry using DHL service";
	}

}
