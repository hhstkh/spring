package com.springtutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtutorial.dao.EmployeeDao;
import com.springtutorial.dao.GenericDao;
import com.springtutorial.entity.Employee;
import com.springtutorial.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl extends GenericServiceImpl<Employee, Integer> implements EmployeeService{
	private EmployeeDao empoyeeDao;
	
	public EmployeeServiceImpl() {
		
	}
	
	@Autowired
	public EmployeeServiceImpl(@Qualifier("employeeDaoImpl")GenericDao<Employee, Integer> genericDao) {
		super(genericDao);
		this.empoyeeDao = (EmployeeDao)genericDao;
	}
	
	
}
