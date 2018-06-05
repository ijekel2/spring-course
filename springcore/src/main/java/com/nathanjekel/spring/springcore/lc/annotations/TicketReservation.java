package com.nathanjekel.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize method.");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp method.");
	}

}
