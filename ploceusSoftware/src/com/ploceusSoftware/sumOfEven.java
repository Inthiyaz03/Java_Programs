package com.ploceusSoftware;

import java.util.Scanner;

public class sumOfEven {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		int sum = 0;
		for(int i=n1;i<=n2;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);;
		
	}

}
