package com.sun.comps;

public abstract class Person {
	private String name;
	private String addrs;
	private AadharDetails aadhar;

	public Person(String name, String addrs, AadharDetails aadhar) {
		super();
		this.name = name;
		this.addrs = addrs;
		this.aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addrs=" + addrs + ", aadhar=" + aadhar + "]";
	}

}
