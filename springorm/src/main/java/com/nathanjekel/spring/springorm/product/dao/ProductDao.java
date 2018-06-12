package com.nathanjekel.spring.springorm.product.dao;

import java.util.List;

import com.nathanjekel.spring.springorm.product.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);
	
	Product find(int id);
	
	List<Product> findAll();
	
	void delete(Product product);

}
