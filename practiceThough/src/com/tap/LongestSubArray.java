package com.tap;

import java.util.Scanner;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int n  = scanner.nextInt();
		int arr [] = new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		longestPrimeSubArray(arr);
	}

	public static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	
	public static void longestPrimeSubArray(int[] arr) {
		// TODO Auto-generated method stub
		
		int maxLen = 0;
        int start = 0;
        
        
		
	}

}
