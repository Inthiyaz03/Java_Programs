package com.tap.launch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.pojo.Employee;

public class LAunch {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ConfigFile.class);
		Employee bean = ac.getBean(Employee.class);
		
		System.out.println(bean);
	}
}
