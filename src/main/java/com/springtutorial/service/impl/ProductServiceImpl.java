package com.springtutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springtutorial.dao.GenericDao;
import com.springtutorial.dao.ProductDao;
import com.springtutorial.entity.Product;
import com.springtutorial.service.ProductService;

@Service
public class ProductServiceImpl extends GenericServiceImpl<Product, Integer> implements ProductService {
	
	private ProductDao productDao;
	
	@Autowired
	public ProductServiceImpl(@Qualifier("productDaoImpl")GenericDao<Product, Integer> genericDao) {
		super(genericDao);
		this.productDao = (ProductDao) genericDao;
	}
}
