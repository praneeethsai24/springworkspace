package com.sun.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDateTime dateTime;

	public SeasonFinder() {
		System.out.println("0 - param Constructor...");
	}

	public String FindOutSeason(String user) {
		System.out.println("SeasonFinder.FindOutSeason()");

		int month = dateTime.getMonthValue();
		if (month >= 3 && month <= 6)
			return "Soo hot:" + user;
		else if (month >= 7 && month <= 10)
			return "winter arc:" + user;
		else
			return "cool climate:" + user;
	}

}
