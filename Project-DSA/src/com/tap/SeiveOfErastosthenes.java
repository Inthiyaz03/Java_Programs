package com.tap;

import java.util.Scanner;

public class SeiveOfErastosthenes {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		seiveOfErastosthenes(n);
	}

	private static void seiveOfErastosthenes(int n) {
		// TODO Auto-generated method stub
		boolean prime [] = new boolean [n+1];
		
		for(int i=2;i*i<=n;i++) {
			if(prime[i]==false) {
				for(int j=i*i;j<=n;j=j+i) {
					prime[j] = true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
		
	}

}
