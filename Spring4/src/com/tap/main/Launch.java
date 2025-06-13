package com.tap.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Launch {
	public static void main(String[] args) {
		
		String configLoc = "/com/tap/config/applicationContext.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(configLoc);
		Employee e = (Employee) a.getBean("emp1");
		
		System.out.println(e);
	}
}
