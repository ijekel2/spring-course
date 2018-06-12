package com.nathanjekel.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nathanjekel.spring.springorm.product.dao.ProductDao;
import com.nathanjekel.spring.springorm.product.entity.Product;

public class TestProductDaoImpl {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springorm/product/test/config.xml");
		ProductDao dao = (ProductDao) context.getBean("productDao");
		List<Product> products = dao.findAll();
		System.out.println(products);
/*		dao.delete(product);*/
/*		dao.update(product);*/
		context.close();
	}

}
