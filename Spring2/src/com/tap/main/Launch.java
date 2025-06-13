package com.tap.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.pojo.Employee;

public class Launch {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(ConfigFile.class );
		Employee e = (Employee) a.getBean("emp1");
		System.out.println(e);
	}
}
