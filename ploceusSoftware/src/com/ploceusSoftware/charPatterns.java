package com.ploceusSoftware;

import java.util.Scanner;

public class charPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String s = scanner.next();
		String t ="";
		for(int i = 0; i < s.length(); i++) {
			t+= s.charAt(i);
			if( t.length() % n ==0) {
				System.out.println(t);
				t ="";
			}
		}
		System.out.println(t);

	}

}
