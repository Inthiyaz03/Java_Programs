package com.tap;

import java.util.Scanner;

public class DecodeString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.println(decodeString(s));

	}

	public static String decodeString(String s) {
		String t = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '1') {
				count++;
			} else {

				if (count != 0) {
					t += (char) (64 + count);
				}
				count = 0;
			}
		}
		t += (char) (64 + count);

		return t;
	}
}
