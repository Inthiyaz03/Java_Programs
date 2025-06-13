package com.tap;

import java.util.Scanner;

public class GcdOrHcf {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int hcf = calculateHCF(a, b);
		int gcd = eculidAlgorithm(a,b);
		int gcd2 = gabrielAlgorithm(a,b);
		System.out.println("gabrielAlgorithm:" +gcd2);
		System.out.println("gcd by euclid: " + gcd);
		System.out.println("The HCF of " + a + " and " + b + " is: " + hcf);

	}
//	gabriel lame optimized euclid algorithm
	static int gabrielAlgorithm(int a,int b) {
		
		while(a !=0 && b !=0) {
			if(a>b) {
				a = a%b;
			}
			else {
				b = b%a;
			}
		}
		if(a!=0) {
			return a;
		}
		else {
            return b;
        }
	}
	
//	euclid algorithm
	static int eculidAlgorithm(int a, int b) {
		
		while(a!=b) {
			if(a>b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
		}
		return a;
		
	}
	
//	brute force method
	static int calculateHCF(int a, int b) {
		int min = 0;
		if(a>b) {
			min = b;
		}
		else {
			min = a;
		}
		
		for(int i=min;i>=1;i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return -1;
	}

}
