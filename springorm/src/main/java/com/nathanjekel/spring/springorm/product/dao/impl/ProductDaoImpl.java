package com.nathanjekel.spring.springorm.product.dao.impl;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.nathanjekel.spring.springorm.product.dao.ProductDao;
import com.nathanjekel.spring.springorm.product.entity.Product;

public class ProductDaoImpl implements ProductDao {
	
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

}
