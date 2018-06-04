package com.nathanjekel.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNationalLanguages {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/properties/propertiesconfig.xml");
		NationalLanguages nationalLanguages = (NationalLanguages) context.getBean("nationalLanguages");
		System.out.println(nationalLanguages);
		context.close();
	}

}
