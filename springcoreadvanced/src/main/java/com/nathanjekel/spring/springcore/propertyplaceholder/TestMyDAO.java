package com.nathanjekel.spring.springcore.propertyplaceholder;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyDAO {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springcore/propertyplaceholder/propertiesconfig.xml");
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);
		context.close();
	}

}
