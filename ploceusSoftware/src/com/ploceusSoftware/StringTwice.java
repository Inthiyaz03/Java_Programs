package com.ploceusSoftware;

import java.util.Scanner;

public class StringTwice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		TwicecharOfSTring(s);
	}

	private static void TwicecharOfSTring(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			sb = sb.append(s.charAt(i)).append(s.charAt(i));
		}
		System.out.println(sb.toString());
		
	}
}
