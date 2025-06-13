package com.tap;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		primeNum(n);

	}

	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

	public static void primeNum(int n) {
		int count = 0;
		for (int i = 0; count < n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
				count++;

			}
		}

	}
}
