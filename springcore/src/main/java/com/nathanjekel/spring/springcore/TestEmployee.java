package com.nathanjekel.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		// Searches for XML config file on the ClassPath
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/config.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getName());
		context.close();
	}

}
