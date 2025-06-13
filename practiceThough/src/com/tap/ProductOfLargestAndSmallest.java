package com.tap;

import java.util.Scanner;

public class ProductOfLargestAndSmallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read the size of the array
		int n = scanner.nextInt();
		int[] arr = new int[n];

		// Read the elements of the array
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Call method to calculate the sum of products
		long result = calculateSumOfProducts(arr, n);

		// Print the result
		System.out.println(result);
	}

	public static long calculateSumOfProducts(int[] arr, int n) {
		long totalProductSum = 0;

		// Iterate through all starting points of the subarray
		for (int size = 0; size < n; size++) {
			int max = arr[size];
			int min = arr[size];

			// Iterate through all end points of the subarray from 'start'
			for (int i = size + 1; i < n; i++) {
				// Update max and min for the current subarray
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);

				// Calculate the product if the size of subarray is greater than 2
				if (i - size + 1 > 2) {
					totalProductSum += (long) max * min;
				}
			}
		}

		return totalProductSum;
	}
}
