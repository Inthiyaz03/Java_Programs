package com.ploceusSoftware;

import java.util.Scanner;

public class countStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] sb = s.split("\\s+");
		System.out.println(sb.length);
	}
}
