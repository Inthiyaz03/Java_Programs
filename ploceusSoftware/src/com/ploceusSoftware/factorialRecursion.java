package com.ploceusSoftware;

import java.util.Scanner;

public class factorialRecursion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println( factorial(n) );
	}

	private static int  factorial(int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		}
		if( n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
