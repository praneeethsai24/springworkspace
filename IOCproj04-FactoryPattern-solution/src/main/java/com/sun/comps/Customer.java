package com.sun.comps;

public class Customer extends Person {
	private double billamnt;
	private String txid;

	public Customer(String name, String addrs, AadharDetails aadhar, double billamnt, String txid) {
		super(name, addrs, aadhar);
		System.out.println("Customer 5 param constructor");
		this.billamnt = billamnt;
		this.txid = txid;
	}

	@Override
	public String toString() {
		return "Customer [billamnt=" + billamnt + ", txid=" + txid + "]" + super.toString();
	}

}
