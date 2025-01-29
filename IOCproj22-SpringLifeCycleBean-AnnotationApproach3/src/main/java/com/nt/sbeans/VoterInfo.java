package com.nt.sbeans;

import java.sql.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("com/nt/commons/info.properties")
@Component("voter")
public class VoterInfo {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private Integer age;
	private Date dov;

	@PostConstruct
	public void myInit() {
		System.out.println("VoterInfo.myInit()");
		dov = new Date(10);
		if (age == null || name == null || age < 0) {
			throw new IllegalArgumentException("invalid inputs:");
		}
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("VoterInfo.destroy()");
		age = null;
		name = null;
		dov = null;
	}

	public String VoterEligibilty() {
		if (age < 18)
			return "Mr/Miss/." + name + " having " + age + " age....u dont have eligibilty sorry " + dov;
		else
			return "Mr/Miss/." + name + " having " + age + " age....u have eligibilty " + dov;
	}
}