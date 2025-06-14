package com.tap.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int id;
	private String name;
	private String email;
	private double salary;
	@Autowired

	private Address address;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, double salary, Address address) {
		super();
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.address = address;
		System.out.println("constructor");
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("setter iam");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
}
