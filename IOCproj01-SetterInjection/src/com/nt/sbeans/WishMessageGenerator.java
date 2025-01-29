package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	// HAS-A-PROPERTY
	private LocalDateTime dateTime;
	private Date dt;

	@Autowired
	public WishMessageGenerator(LocalDateTime datetime, Date dt) {
        System.out.println("WishMessageGenerator: two param constructor");
		this.dateTime = datetime;
		this.dt = dt;
	}

	/*//setter-injection constructor
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.0-param constructor");
	}
	
	
	//setter method for setter injection
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
	}
	*/
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		System.out.println(dateTime+" "+dt);
		// get current hour of the day
		int hour = dateTime.getHour();
		// generate wish message
		if (hour < 12)
			return "Good morning:" + user;
		else if (hour < 16)
			return "Good Afternoon:" + user;
		else if (hour < 20)
			return "Good Evening:" + user;
		else
			return "Good Night:" + user;
	}

}
