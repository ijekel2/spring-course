package com.nathanjekel.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarDealer {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels());
		System.out.println(carDealer.getModels().getClass());
		context.close();
	}

}
