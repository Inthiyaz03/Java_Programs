package com.tap.launch;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tap.pojo.Student;

public class Launch {
	public static void main(String[] args) {
		String configLoc = "/com/tap/config/applicationContext.xml";
		  ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(configLoc);
		  Student st = (Student) ac.getBean("stu");
		  System.out.println(st);
	}
}
