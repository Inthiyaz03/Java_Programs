package com.tap;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		
        System.out.println("Number of digits: " + countDigits(n));
        
        scanner.close();
	}
	
	public static int countDigits(int n) {
			int count = 0;
        
        while (n!= 0) {
            n /= 10;
            count++;
        }
        
        return count;
	}
}
