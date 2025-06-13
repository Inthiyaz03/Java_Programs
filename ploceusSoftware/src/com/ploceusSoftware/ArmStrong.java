package com.ploceusSoftware;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = "" + n;
		int length = s.length();
		armstrong(n,length);
	}

	private static void armstrong(int n, int length) {
		
		int sum = 0;
		int temp = n;
		while(temp!=0) {
			int digit = temp % 10;
			sum += Math.pow(digit, length);
			temp /= 10;
		}
		if(sum == n) {
			System.out.println("Armstrong  num");
		}
		else {
			System.out.println("Not an Armstrong num");
		}
		
	}
}
