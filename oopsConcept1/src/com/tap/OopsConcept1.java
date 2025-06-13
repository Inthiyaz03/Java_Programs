package com.tap;

import java.util.Scanner;

abstract class bankAccount{
	protected String accName;
	protected String accNumber;
	protected String bankName;
	public bankAccount(String accName, String accNumber, String bankName) {
		super();
		this.accName = accName;
		this.accNumber = accNumber;
		this.bankName = bankName;
	}
	
	public void dispDetails() {
		System.out.println("acccount name: " + accName);
		System.out.println("account number: " + accNumber);
		System.out.println("bank name: " + bankName );
	}

}

class CurrentAccount extends bankAccount{

	private String tinNumber;

	public CurrentAccount(String accName, String accNumber, String bankName,String tinNumber) {
		super(accName, accNumber, bankName);
		this.tinNumber=tinNumber;
	}
	@Override
	public void dispDetails() {
		System.out.println("tin number: " + tinNumber );
		super.dispDetails();
	}
	
}

class SavingsAccount extends bankAccount{
	private String orgName;
	public SavingsAccount(String accNumber, String accName, String bankName,String orgName) {
		super(accName, accNumber, bankName);
		this.orgName = orgName;
	}
	
	@Override
	public void dispDetails() {
		System.out.println("organization name: " + orgName);
		super.dispDetails();
	}

}

public class OopsConcept1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("choose type of account \n1.savings account \n2.current account");
		int choice = scan.nextInt();
		scan.nextLine();
		if(choice==1) {
			System.out.println("enter account details  accNumber,  accName,  bankName, orgName");
			String accDetails = scan.nextLine();
			String details[] = accDetails.split(",");
			SavingsAccount sa = new SavingsAccount(details[0], details[1], details[2], details[3]);
			sa.dispDetails();
		}
		else if(choice==2) {
			System.out.println("enter account details  accNumber,  accName,  bankName, orgName");
			String accDetails = scan.nextLine();
			String details[] = accDetails.split(",");
			CurrentAccount ca = new CurrentAccount(details[0], details[1], details[2], details[3]);
			ca.dispDetails();
		}
		else {
			System.out.println("invalid acount type");
		}

	
	}

}
