package com.nathanjekel.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddition {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/constructorinjection/ambiguity/constructorinjectionconfig.xml");
		Addition addition = (Addition) context.getBean("addition");
		context.close();
	}
	
}
