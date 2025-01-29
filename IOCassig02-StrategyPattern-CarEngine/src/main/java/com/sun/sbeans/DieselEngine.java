package com.sun.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("deng")
@Primary()
public final class DieselEngine implements Engine {

	public DieselEngine() {
		System.out.println("DiesalEngine: 0-param constructor");
	}

	@Override
	public String suv(int num) {

		return "thar has 4 wheel drive ,diesel version" + num;
	}

}
