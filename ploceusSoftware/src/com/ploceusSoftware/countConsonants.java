package com.ploceusSoftware;

import java.util.Scanner;

public class countConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String s = scanner.nextLine();
		countCons(s);
	}

	private static void countCons(String s) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
			if(!(c=='a' | c=='e' || c=='i' || c== 'o' || c== 'u'||
					c=='A' || c== 'E' || c=='I' || c== 'O' || c== 'U')) {
				count++;
			}
		
	}
		System.out.println(count);;
	}
}

