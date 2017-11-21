package com.springtutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springtutorial.dao.CustomerDao;
import com.springtutorial.dao.GenericDao;
import com.springtutorial.entity.Customer;
import com.springtutorial.service.CustomerService;

@Service
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Integer> implements CustomerService {
	
	private CustomerDao customerDao;
	
	@Autowired
	public CustomerServiceImpl(@Qualifier("customerDaoImpl")GenericDao<Customer, Integer> genericDao) {
		super(genericDao);
		this.customerDao = (CustomerDao)genericDao;
	}

}
