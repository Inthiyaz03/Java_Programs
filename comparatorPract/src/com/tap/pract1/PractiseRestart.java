
package com.tap.pract1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Demo1 implements Comparator<Amazon> {

	@Override
	public int compare(Amazon a1, Amazon a2) {

		return a1.getProductName().compareTo(a2.getProductName());

	}

}

class Demo2 implements Comparator<Amazon> {

	@Override
	public int compare(Amazon a1, Amazon a2) {
		Integer price1 = a1.getPrice();
		Integer price2 = a2.getPrice();
		return price1.compareTo(price2);
	}

}

class Demo3 implements Comparator<Amazon> {
	@Override
	public int compare(Amazon a1, Amazon a2) {

		Integer review1 = a1.getReview();
		Integer review2 = a2.getReview();

		return review1.compareTo(review2);
	}
}

class Amazon {

	private int price;
	private String productName;
	private int review;

	public Amazon(int price, String productName, int review) {
		super();
		this.price = price;
		this.productName = productName;
		this.review = review;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getReview() {
		return review;
	}

	public void setReview(int review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "price=" + price + ", productName=" + productName + ", review=" + review;
	}

}

public class PractiseRestart {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no of products: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		ArrayList<Amazon> al = new ArrayList();

		for (int i = 0; i < n; i++) {
			String s = scanner.nextLine();

			String[] arr = s.split(",");
			int price = Integer.parseInt(arr[0]);
			String productName = arr[1];
			int review = Integer.parseInt(arr[2]);

			Amazon amazon = new Amazon(price, productName, review);
			al.add(amazon);

		}

		System.out.println("Enter sorting order : \n 1.name in ascending + \n 2.name in descending + "
				+ "\n 3.price in ascending + \n 4.price in descending + \n 5.review in ascending +"
				+ " \n 6.review in descending");

		int choice = scanner.nextInt();
		if (choice == 1) {
			Collections.sort(al, new Demo1());
		} else if (choice == 2) {
			Collections.sort(al, new Demo1().reversed());
		}

		else if (choice == 3) {
			Collections.sort(al, new Demo2());
		} else if (choice == 4) {
			Collections.sort(al, new Demo2().reversed());
		} else if (choice == 5) {
			Collections.sort(al, new Demo3());
		} else if (choice == 6) {
			Collections.sort(al, new Demo3().reversed());
		}

		for (Amazon ama : al) {
			System.out.println(ama);
		}

	}
}
