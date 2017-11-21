package com.springtutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtutorial.dao.GenericDao;
import com.springtutorial.dao.OrderDao;
import com.springtutorial.entity.Order;
import com.springtutorial.service.OrderService;

@Service
@Transactional
public class OrderServiceImpl extends GenericServiceImpl<Order, Integer> implements OrderService {
	private OrderDao orderDao;
	
	@Autowired
	public OrderServiceImpl(@Qualifier("orderDaoImpl") GenericDao<Order, Integer> genericDao) {
		super(genericDao);
		this.orderDao = (OrderDao)genericDao;
	}
}
