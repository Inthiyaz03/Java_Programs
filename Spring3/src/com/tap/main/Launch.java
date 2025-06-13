package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.pojo.Employee;
import com.tap.pojo2.Student;

public class Launch {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(ConfigFile.class);
		Employee e = a.getBean(Employee.class);
		
		Student s = a.getBean(Student.class);
		System.out.println(e);
		System.out.println(s);
		
		
	}
}
