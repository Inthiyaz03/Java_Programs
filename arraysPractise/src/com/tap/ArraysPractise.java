package com.tap;

import java.util.Scanner;

public class ArraysPractise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][][] a = new int [2][][];
		a[0] = new int [3][];
		a[1] = new int [5][];
		
		a[0][0] = new int [1];
		a[0][1] = new int [2];
		a[0][2] = new int [3];
		
		
		a[1][0] = new int [1];
		a[1][1] = new int [2];
		a[1][2] = new int [3];
		a[1][3] = new int [4];
		a[1][4] = new int [5];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("enter the school " + (i+1) + " class" + (j+1) + " students "+ (k+1));
					a[i][j][k] = scan.nextInt();
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	
		
		
	}

}
