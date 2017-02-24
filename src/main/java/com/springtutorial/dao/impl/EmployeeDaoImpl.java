package com.springtutorial.dao.impl;

import org.springframework.stereotype.Repository;

import com.springtutorial.dao.EmployeeDao;
import com.springtutorial.entity.Employee;

@Repository
public class EmployeeDaoImpl extends GenericDaoImpl<Employee, Integer> implements EmployeeDao {

	/*public EmploeeDaoImpl(Class<Employee> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}*/
	
}
