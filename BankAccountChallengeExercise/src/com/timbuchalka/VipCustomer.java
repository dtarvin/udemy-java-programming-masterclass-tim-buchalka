package com.timbuchalka;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public VipCustomer() {
		this("Customer", 300.00, "n/a");
	}
	
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "n/a");
	}
	
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
}
