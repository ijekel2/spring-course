package com.nathanjekel.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductsList {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductsList productsList = (ProductsList) context.getBean("productsList");
		System.out.println(productsList);
		System.out.println(productsList.getProducts().getClass());
		context.close();
	}

}
