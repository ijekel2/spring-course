package com.nathanjekel.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTicketReservation {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/nathanjekel/spring/springcore/lc/annotations/config.xml");
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketReservation");
		System.out.println(ticketReservation);
		context.close();
		
	}

}
