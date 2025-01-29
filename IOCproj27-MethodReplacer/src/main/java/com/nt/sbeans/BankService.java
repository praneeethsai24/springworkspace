package com.nt.sbeans;

public  class BankService {
	public double calculateIntrestAmount(double pamt, double rate, double time) {
		System.out.println("BankService.calculateIntrestAmount() simple Intrest");
		return (pamt * Math.pow(1 + rate / 100, time)) - pamt;
	}
}
