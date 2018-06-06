package com.nathanjekel.spring.springcoreadvanced.autowiring.hotel;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;
	
	@Autowired
	private Reservation reservation;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}

}
