package com.nathanjekel.spring.springcoreadvanced.standalone.collections;

import java.util.List;

public class ProductsList {

	private List<String> products;

	@Override
	public String toString() {
		return "ProductsList [products=" + products + "]";
	}

	public List<String> getProducts() {
		return products;
	}

	public void setProducts(List<String> products) {
		this.products = products;
	}

}
