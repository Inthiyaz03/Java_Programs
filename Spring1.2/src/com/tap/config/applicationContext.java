package com.tap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tap.pojo.Student;

@Configuration
public class applicationContext {
	
	@Bean
	public Student stu1() {
		Student s = new Student();
		s.setId(1);
		s.setPhone("1234");
		s.setName("John Doe");
		s.setEmail("johndoe@example.com");
        return s;
	}
}
