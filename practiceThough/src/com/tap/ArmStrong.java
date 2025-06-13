package com.tap;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		isArmStrong(n);

	}

	public static void isArmStrong(int n) {

		int sum = 0, temp = n, originalNumber = n;
		int digitCount = (int) (Math.log10(n) + 1);

		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digitCount);
			temp /= 10;
		}

		if (originalNumber == sum) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}
	}
}
