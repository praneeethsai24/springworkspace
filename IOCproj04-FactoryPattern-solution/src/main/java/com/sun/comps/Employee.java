package com.sun.comps;

public class Employee extends Person {
	private int empid;
	private String desg;

	public Employee(String name, String addrs, AadharDetails aadhar, int empid, String desg) {
		super(name, addrs, aadhar);
		System.out.println("Employee:: 5 param Constructor");
		this.empid = empid;
		this.desg = desg;
		
		
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", desg=" + desg + "]"+super.toString();
	}
}
