package com.ploceusSoftware;

import java.util.Scanner;

public class printCharInPatttern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = "";
		for(int i=0;i<s.length();i++) {
			if(i % 2 ==0) {
				t = t + s.charAt(i) +s.charAt(i) + s.charAt(i); 
			}
			else {
				System.out.println(t);
				t = "";
			}
		}
		System.out.println(t);
	}
}
