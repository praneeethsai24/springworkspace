package com.sun.comps;

public class Student extends Person {
	private int studid;
	private String course;

	public Student(String name, String addrs, AadharDetails aadhar, int studid, String course) {
		super(name, addrs, aadhar);
		this.studid = studid;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", course=" + course + "]"+super.toString();
	}
}
