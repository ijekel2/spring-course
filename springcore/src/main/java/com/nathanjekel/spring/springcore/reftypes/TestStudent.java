package com.nathanjekel.spring.springcore.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springcore/reftypes/reftypesconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		context.close();
	}

}
