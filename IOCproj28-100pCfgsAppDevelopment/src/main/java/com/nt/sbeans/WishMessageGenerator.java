package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalDateTime datetime;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public String generateWishmessage(String user) {
		System.out.println("WishMessageGenerator.generateWishmessage()" + datetime);
		int hour = datetime.getHour();
		if (hour < 12)
			return "GOOD MORNING:: " + user;
		else if (hour < 16)
			return "GOOD AFTERNOON:: " + user;
		else if (hour < 20)
			return "GOOD EVENING:: " + user;
		else
			return "GOOD NIGHT:: " + user;
	}
}
