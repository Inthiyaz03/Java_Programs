package com.tap;

import java.util.Scanner;

public class Divisors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		divisors(n);

	}

	private static void divisors(int n) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		for(;i>=1;i--) {
			if(n%i==0 && i!=n/i) {
                System.out.println(n/i);
            }
		}

	}
}
