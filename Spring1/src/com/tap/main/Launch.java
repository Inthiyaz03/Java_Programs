package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Launch {
	public static void main(String[] args) {

		String configLoc = "/com/tap/config/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLoc);
		Employee e = (Employee) context.getBean("emp1");
		System.out.println(e);
		Employee e1 = (Employee) context.getBean("emp2");
		System.out.println(e1);

	}
}
