package com.springtutorial.dao.impl;

import org.springframework.stereotype.Repository;

import com.springtutorial.dao.CustomerDao;
import com.springtutorial.entity.Customer;

@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer, Integer> implements CustomerDao {

}
