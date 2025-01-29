package com.nt.model;

public class Customer {
	private Integer cno;
	private String cname;
	private String Adds;
	private double billamount;
	private double discount;
	private double finalAmount;

	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAdds() {
		return Adds;
	}

	public void setAdds(String adds) {
		Adds = adds;
	}

	public double getBillamount() {
		return billamount;
	}

	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

}
