package com.sun.comps;

public class AadharDetails {
	private long aadharno;
	private int age;
	private long mobileno;
	
	public AadharDetails(long aadharno, int age, long mobileno) {
		super();
		this.aadharno = aadharno;
		this.age = age;
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return "AadharDetails [aadharno=" + aadharno + ", age=" + age + ", mobileno=" + mobileno + "]";
	}
	

}
