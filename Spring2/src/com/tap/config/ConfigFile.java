package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Employee;

@Configuration
public class ConfigFile {
	
	@Bean
	public Employee emp1() {
		
		Employee e = new Employee();
		return e;
		
	}
	
	
	
}
