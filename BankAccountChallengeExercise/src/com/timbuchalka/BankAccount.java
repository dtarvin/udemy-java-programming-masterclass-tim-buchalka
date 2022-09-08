package com.timbuchalka;

public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositFunds(double funds) {
		System.out.println("You are depositing $" + funds);
		this.balance += funds;
		System.out.println("Your balance is now $" + this.balance);
	}
	
	public void withdrawFunds(double funds) {
		if (funds > this.balance) {
			System.out.println("You do not have sufficient funds for the requested withdrawal");
			System.out.println("Your balance is $" + this.balance);
		} else {
			System.out.println("You are withdrawing $" + funds);
			this.balance -= funds;
			System.out.println("Your balance is now $" + this.balance);
		}
		
	}
}
