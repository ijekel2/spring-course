package com.nathanjekel.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {

	private Integer id;
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("Inside setter method");
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}
