package com.nathanjekel.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nathanjekel.spring.springjdbc.employee.dao.EmployeeDao;
import com.nathanjekel.spring.springjdbc.employee.dto.Employee;

public class TestEmployeeDaoImpl {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/nathanjekel/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
/*		Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstName("Janorus");
		employee.setLastName("Thimble");
		int result = dao.update(employee);
		int result = dao.delete(3);
		Employee employee = dao.read(2);
		System.out.println("Employee Record: " + employee);*/
		List<Employee> result = dao.read();
		System.out.println("Employee Record: " + result);
		context.close();
	}

}
