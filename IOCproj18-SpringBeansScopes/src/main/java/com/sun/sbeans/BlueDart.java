package com.sun.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {

		return "order id " + oid + " order is set for delievry using BLueDart service";
	}

}
