package com.nathanjekel.spring.springcoreadvanced.injection.interfaces;

import org.springframework.stereotype.Component;

@Component("dao1")
public class OrderDAOImpl implements OrderDAO {
	
	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO createOrder()");
	}

}
