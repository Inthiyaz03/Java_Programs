package com.tap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostAndLeastOccuringCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine(); // Example input
		System.out.println(findMostAndLeast(input));
	}

	public static String findMostAndLeast(String s) {
		Map<Character, Integer> frequencyMap = new HashMap<>();

		// Count the frequency of each character
		for (char ch : s.toCharArray()) {
			frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
		}

		char mostChar = ' ';
		char leastChar = ' ';
		int maxCount = 0;
		int minCount = Integer.MAX_VALUE;

		// Find the most and least occurring characters
		for (char ch : s.toCharArray()) {
			int count = frequencyMap.get(ch);

			// Check for most occurring character
			if (count > maxCount) {
				maxCount = count;
				mostChar = ch;
			}

			// Check for least occurring character
			if (count < minCount) {
				minCount = count;
				leastChar = ch;
			}
		}

		return mostChar + " - " + leastChar;
	}
}
