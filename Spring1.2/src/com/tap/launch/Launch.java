package com.tap.launch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.applicationContext;
import com.tap.pojo.Student;

public class Launch {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(applicationContext.class);
		
		Student bean = (Student) config.getBean("stu1");
		System.out.println(bean);
	}
}
