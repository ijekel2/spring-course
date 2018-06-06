package com.nathanjekel.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstructor {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springcoreadvanced/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) context.getBean("inst");
		Instructor instructor2 = (Instructor) context.getBean("inst");
		System.out.println(instructor);
		System.out.println(instructor2);
		context.close();
	}

}
