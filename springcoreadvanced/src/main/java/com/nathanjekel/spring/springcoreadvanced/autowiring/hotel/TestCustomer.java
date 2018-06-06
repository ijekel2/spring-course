package com.nathanjekel.spring.springcoreadvanced.autowiring.hotel;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomer {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springcoreadvanced/autowiring/hotel/hotelconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		context.close();
	}

}
