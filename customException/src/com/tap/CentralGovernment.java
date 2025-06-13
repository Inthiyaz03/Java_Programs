package com.tap;

import java.util.Scanner;

//Custom Exception for Age Validation
class VotingAgeException extends Exception {
	public VotingAgeException(String messae) {
		super(messae);
	}
}

public class CentralGovernment {

	// Function to check age and throw custom exception
	public static void checkAge(int age) throws VotingAgeException {
		if (age < 18) {
			throw new VotingAgeException("Under age.");
		} else if (age <= 60) {
			throw new VotingAgeException("You are eligible to vote.");
		} else if (age <= 100) {
			throw new VotingAgeException("Over age.");
		} else {
			throw new VotingAgeException("Invalid age.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempt = 0;
		int below18Count = 0, eligibleCount = 0, over60Count = 0;

		while (attempt < 3) {
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();

			try {
				checkAge(age);
			} catch (VotingAgeException e) {
				System.out.println(e.getMessage());

				// Count the different age groupings
				if (age < 18 && age >= 0) {
					below18Count++;
				} else if (age >= 18 && age <= 60) {
					eligibleCount++;
				} else if (age > 60 && age <= 100) {
					over60Count++;
				}

				attempt++;
			}
		}

		// Determine the majority input based on user attempts
		if (below18Count > eligibleCount && below18Count > over60Count) {
			System.out.println("Final verdict: You are under age.");
		} else if (eligibleCount > below18Count && eligibleCount > over60Count) {
			System.out.println("Final verdict: You are eligible to vote.");
		} else if (over60Count > below18Count && over60Count > eligibleCount) {
			System.out.println("Final verdict: You are over age.");
		} else {
			System.out.println("Go and contact the voting department.");
		}

		scanner.close();
	}
}
