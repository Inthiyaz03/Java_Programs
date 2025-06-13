package com.tap.pract1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


 class Rbi implements Comparator<Bank> {
	@Override
	 public int compare(Bank b1, Bank b2) {
		String n1 = b1.getC_name();
		String n2 = b2.getC_name();
		Integer id1 = b1.getC_id();
		Integer id2 = b2.getC_id();
		if(n1.equals(n2)) {
			return id1.compareTo(id2);
		}
		return n1.compareTo(n2); 
	 }
	
}

class Bank implements Comparable<Bank> {
	private int c_id;
	private String c_name;
	private String branch;
	private int loan;
	
	public Bank(int c_id, String c_name, String branch, int loan) {
		this.c_id = c_id;
		this.c_name = c_name;
		this.branch = branch;
		this.loan = loan;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setLoan(int loan) {
		this.loan = loan;
	}
	public int getC_id() {
		return c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public String getBranch() {
		return branch;
	}
	public int getLoan() {
		return loan;
	}
	
	public String toString() {
		return  c_id +" "  + c_name + " " +  branch +" "  + loan;
	}
	@Override
	public int compareTo(Bank o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class Practice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the no of customers: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String s [] = new String [n];
		for(int i=0;i<s.length;i++) {
			s[i] = scanner.nextLine();
		}
		
		ArrayList<Bank> al = new ArrayList<Bank>();
		
		for(int i=0;i<n;i++) {
			String arr[] = s[i].split(",");
			int c_id = Integer.parseInt(arr[0]);
			String c_name =arr[1];
			String branch = arr[2];
			int loan = Integer.parseInt(arr[3]);
			Bank ba = new Bank( c_id,  c_name,  branch,  loan);
			al.add(ba);
		}
		
		
		Rbi rbi = new Rbi();
		Collections.sort(al,rbi);
		
		
		for(Bank e : al) {
			System.out.println(e);
		}
	
		
		
	}

}
