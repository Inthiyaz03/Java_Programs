package com.tap.pract1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class demo implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {

		return 0;

	}

}

class Customer {

	private int customer_id;
	private String customer_name;
	private String product_name;
	private int product_price;

	public Customer(int customer_id, String customer_name, String product_name, int product_price) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.product_name = product_name;
		this.product_price = product_price;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	@Override
	public String toString() {
		return customer_id + "," + customer_name + "," + product_name + "," + product_price;
	}

}

public class Emp_Comp_Prob {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> al = new ArrayList();

		while (scanner.hasNextLine()) {

			String s = scanner.nextLine();
			al.add(s);
			if (s.trim().isEmpty()) {
				break;
			}

		}

		for (String s : al) {
			System.out.println(s);
		}

	}

}
