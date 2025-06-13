package com.tap;

import java.util.Scanner;

class Company implements Comparable<Company>{

	
	int id;
	String name;
	String role;
	int salary;
	int phone;
	String address;
	
	
    Company(int id, String name, String role, int salary, int phone, String address) {
    	this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.phone = phone;
        this.address = address;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
        this.address = address;
    }
	
	
	public int getId() {
		return id;
	}
	public String getName() {
        return name;
    }
	public String getRole() {
		return role;
	}
	public int getSalary() {
		return salary;
	} 
	public int getPhone() {
        return phone;
    }
	public String getAddress() {
        return address;
    }
	
	
	@Override
	public int compareTo(Company c1) {
		String a1 = c1.getName();
		String c2 = this.getName();
		
		return a1.compareTo(c2);
	}
	
	@Override
	public String toString() {
        return "Company [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + ", phone=" + phone
                + ", address=" + address + "]";
    }
	
	
}



public class Comparablee {

	public static void main(String[] args) {
		System.out.println("enter the no of employees");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
	
		
		Company [] company = new Company[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("enter id, name, role, salary, phone, address");
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            String role = scanner.nextLine();
            int salary = scanner.nextInt();
            int phone = scanner.nextInt();
            scanner.nextLine();
            String address = scanner.nextLine();
            
             company[i] = new Company(id, name, role, salary, phone, address);;
		}
		
		
		for(Company compan : company) {
			System.out.println(compan);
		}
				
	}

}
