package com.tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Demo implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		if (e1.getfName().equals(e2.getfName())) {
			Integer age1 = e1.getAge();
			Integer age2 = e2.getAge();
			return age1.compareTo(age2);
		} else {
			return e1.getfName().compareTo(e2.getfName());
		}
	}
}

 class Employee1 {
	private int id;
	private String fName;
	private String lName;
	private int age;

	public Employee1() {

	}

	public Employee1(int id, String fName, String lName, int age) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return id + " " + fName + " " + lName + " " + age;
	}

}

public class Practiceee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		String s[] = new String[n];
		for (int i = 0; i < s.length; i++) {
			s[i] = scan.nextLine();
		}

		ArrayList<Employee1> em = new ArrayList<Employee1>();

		for (int i = 0; i < n; i++) {
			String arr[] = s[i].split(",");
			int id = Integer.parseInt(arr[0]);
			String fName = arr[1];
			String lName = arr[2];
			int age = Integer.parseInt(arr[3]);
			Employee1 e1 = new Employee1(id, fName, lName, age);
			em.add(e1);
		}

		Demo d = new Demo();

		Collections.sort(em, d);

		for (Employee1 e : em) {
			System.out.println(e);
		}
		scan.close();
	}
}
