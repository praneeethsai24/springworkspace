package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {

	public CricketBat() {
		System.out.println("CricketBat:: 0-param Constructor");
	}

	public int scoreRuns() {
		return new Random().nextInt(300);
	}

}
