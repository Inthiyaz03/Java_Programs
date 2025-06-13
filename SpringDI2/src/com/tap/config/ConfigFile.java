package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Address;
import com.tap.pojo.Employee;

@Configuration
public class ConfigFile {
	
	@Bean
	public Employee e1() {
		
		Employee e1 = new Employee();
		
		e1.setId(1);
		e1.setName("John Doe");
		e1.setEmail("johndoe@example.com");
		e1.setSalary(50000.0);

		return e1;
		
	}
	
	@Bean
	public Address a1() {
		
		Address a1 = new Address();
		a1.setHouseNum(123);
		a1.setStreet("Main Street");
		a1.setCity("New York");
		a1.setState("NY");
		a1.setCountry("USA");
		return a1;
	}
}
