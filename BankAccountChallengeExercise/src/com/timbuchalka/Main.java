package com.timbuchalka;

//import com.timbuchalka.BankAccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bobsAccount = new BankAccount();
		bobsAccount.withdrawFunds(100.00);
		
		VipCustomer john = new VipCustomer();
		VipCustomer bill = new VipCustomer("Bill", 700.00);
		VipCustomer dale = new VipCustomer("Dale", 1500.00, "dale@me.com");
		
		System.out.println("john - name = " + john.getName() + ", credit limit = " + john.getCreditLimit() + ", email = " + john.getEmailAddress());
		System.out.println("bill - name = " + bill.getName() + ", credit limit = " + bill.getCreditLimit() + ", email = " + bill.getEmailAddress());
		System.out.println("dale - name = " + dale.getName() + ", credit limit = " + dale.getCreditLimit() + ", email = " + dale.getEmailAddress());
	}

}
