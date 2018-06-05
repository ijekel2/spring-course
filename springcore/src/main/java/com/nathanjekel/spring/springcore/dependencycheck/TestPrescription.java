package com.nathanjekel.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrescription {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/dependencycheck/dependencycheckconfig.xml");
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
	}

}
