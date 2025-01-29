package com.sun.sbeans;

import org.springframework.stereotype.Component;

@Component("ceng")
public final class CngEngine implements Engine {

	public CngEngine() {
		System.out.println("CngEngine: 0-param constructor");
	}

	@Override
	public String suv(int num) {

		return "thar has 4 wheel drive, CNG version" + num;
	}

}
