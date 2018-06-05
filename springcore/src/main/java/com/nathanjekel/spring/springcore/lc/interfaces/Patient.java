package com.nathanjekel.spring.springcore.lc.interfaces;

public class Patient {

	private Integer id;
	
	public void init() {
		System.out.println("Inside init method");
	}

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
