package com.tap;

import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		primeFactors(n);
	}

	private static void primeFactors(int n) {
		// TODO Auto-generated method stub
		int i=2;
		while(i*i<=n) {
			while(n%i==0) {
				System.out.println(i);
				n/=i;
			}
			i++;
		}
		if(n>1) {
			System.out.println(n);
		}
	}

}
