package com.tap.pojo2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("1")
	private int id;
	
	@Value("hulk")
	private String name;
	
	@Value("hulk@gmail.com")    
	private String email;
	
	public Student() {
        super();
    }
	
	public Student(int id, String name, String email) {
		this.id = id;
        this.name = name;
        this.email = email;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	

}
