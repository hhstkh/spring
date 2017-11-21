package com.springtutorial.dao.impl;

import org.springframework.stereotype.Repository;

import com.springtutorial.dao.OrderDao;
import com.springtutorial.entity.Order;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order, Integer> implements OrderDao {

}
