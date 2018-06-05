package com.nathanjekel.spring.springcore.innerbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/innerbeans/innerbeansconfig.xml");
		Employee employee = (Employee) context.getBean("employee");
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
		context.close();
	}
	
}
