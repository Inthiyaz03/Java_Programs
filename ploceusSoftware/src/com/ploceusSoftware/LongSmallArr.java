package com.ploceusSoftware;

import java.util.Scanner;

public class LongSmallArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr [] = new int [n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int small = arr[0];
		int large = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i] <  small) {
				small = arr[i];
			}
			else if(arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println(small);
		System.out.println(large);
		
	}

}
