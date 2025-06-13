package com.tap;

import java.util.Scanner;

public class PrefixSuffixOfString {
	
	public static void palindrome(String s) {
		String t="";
		int i=0, j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				System.out.println(t);
				return;
			}
			else
			{
				t= t + s.charAt(i) ;
				i++;
				j--;
			}
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		String s = scan.nextLine();
		palindrome(s);
	}

}
