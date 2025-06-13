package com.tap.launch;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tap.config.ConfigFile;
import com.tap.pojo.Student;

public class Launch {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(ConfigFile.class);
		Student bean = (Student) a.getBean(Student.class);
		System.out.println(bean);
	}
}
