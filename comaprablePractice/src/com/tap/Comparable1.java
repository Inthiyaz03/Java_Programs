package com.tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee e2) {
	
		Integer id1 = this.getId();
		Integer id2 = e2.getId();
		String name1 = this.getName();
		String name2 = e2.getName();
		if(id1.equals(id2)) {
			return name1.compareTo(name2);
		}
		return id1.compareTo(id2);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

}

public class Comparable1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<Employee> li = new ArrayList<>();
		while (scanner.hasNextLine()) {

			String s = scanner.nextLine();
			if (s.isEmpty())
				break;

			String arr[] = s.split(",");
			int id = Integer.parseInt(arr[0]);
			String name = arr[1];
			int salary = Integer.parseInt(arr[2]);

			li.add(new Employee(id, name, salary));

		}
		Collections.sort( li);
		System.out.println(li);
	}

}
