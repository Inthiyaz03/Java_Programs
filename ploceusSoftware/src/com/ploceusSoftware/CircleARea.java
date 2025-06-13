package com.ploceusSoftware;

import java.util.Scanner;


public class CircleARea {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int radius = scanner.nextInt();
		double area = radius * radius * Math.PI;
		System.out.println(area);
	}

}
