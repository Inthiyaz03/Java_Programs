package com.tap;

import java.util.Scanner;

public class TrailingZeroesOfFact {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(trailingZeroes(n));
	}
	
	public static int trailingZeroes(int n) {
		
		int res = 0;
		int powerOf5 = 5;
		while(n>=powerOf5) {
			res += n/powerOf5;
            powerOf5 *= 5;
		}
		return res;
	}
}
