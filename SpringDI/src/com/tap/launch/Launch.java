package com.tap.launch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.pojo.Employee;

public class Launch {
	public static void main(String[] args) {
		String config = "/com/tap/config/applicationContext.xml";
		ApplicationContext a = new ClassPathXmlApplicationContext(config);
		
		Employee bean = (Employee) a.getBean("emp1");
		System.out.println(bean);
	}
}
