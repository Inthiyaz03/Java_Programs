package com.tap;

import java.util.Scanner;

public class LowestCommonfactor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		lcm(a,b);
		lcm1(a,b);
	}
	
//	optimized
	public static void lcm(int a, int b) {
        int lcm = (a * b) / gcd(a, b);
        System.out.println("Lowest Common Factor: " + lcm);
    }
	
	static int gcd(int a,int b) {
			
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
	
//	brute force approach
	public static void lcm1(int a, int b) {
		
		    int res = Math.max(a, b);
		    while(true) {
		    	if(res %a==0 && res %b==0) {
		    		break;
		    	}
		    	res++;
		    }
		    System.out.println("lcm by brute = " + res);
		    
		
	}
}
