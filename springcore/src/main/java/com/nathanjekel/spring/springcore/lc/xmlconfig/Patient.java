package com.nathanjekel.spring.springcore.lc.xmlconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

	private Integer id;
	
	public void init() {
		System.out.println("Inside init method");
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

	@Override
	public void afterPropertiesSet() throws Exception {
			System.out.println("Inside afterPropertiesSet");
	}
	
	@Override
	public void destroy() throws Exception {
			System.out.println("Inside destroy method");
	}

}
