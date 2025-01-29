package com.sun.sbeans;

import org.springframework.stereotype.Component;

@Component("peng")
public final class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine: 0-param constructor");
	}

	@Override
	public String suv(int num) {

		return "thar has 4 wheel drive, petrol version"+num;
	}

}
