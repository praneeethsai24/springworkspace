package com.nt.sbeans;

import java.sql.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class VoterInfo implements InitializingBean, DisposableBean {
	private String name;
	private Integer age;
	private Date dov;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	/*
	 * public void myInit() { System.out.println("VoterInfo.myInit()"); dov = new
	 * Date(10); if (age == null || name == null || age < 0) { throw new
	 * IllegalArgumentException("invalid inputs:"); } }
	 * 
	 * public void myDestroy() { System.out.println("VoterInfo.destroy()"); age =
	 * null; name = null; dov = null; }
	 */

	public String VoterEligibilty() {
		if (age < 18)
			return "Mr/Miss/." + name + " having " + age + " age....u dont have eligibilty sorry " + dov;
		else
			return "Mr/Miss/." + name + " having " + age + " age....u have eligibilty " + dov;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("VoterInfo.destroy()");
		age = null;
		name = null;
		dov = null;

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("VoterInfo.afterPropertiesSet()");
		dov = new Date(10);
		if (age == null || name == null || age < 0) {
			throw new IllegalArgumentException("invalid inputs:");
		}
	}
}
