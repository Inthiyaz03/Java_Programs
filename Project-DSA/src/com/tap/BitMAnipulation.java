package com.tap;

import java.util.Scanner;

public class BitMAnipulation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = decimalToBinary(n);
		System.out.println(s);
		int res   = binaryToDecimal(s);
		System.out.println(res);
		
	}

	private static int binaryToDecimal(String s) {
		// TODO Auto-generated method stub
		int res =0 ;
		int powOf2 = 1;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)== '1') {
				res+=powOf2;
			}
			powOf2*=2;
		}
		return res;
		
	}

	private static String decimalToBinary(int n) {
		// TODO Auto-generated method stub
		String s ="";
		while(n>=1) {
			int temp = n%2;
			n = n/2;
			s = temp +s;
		}
		return s;
	}
	

}
