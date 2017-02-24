package com.springtutorial.dao.impl;

import org.springframework.stereotype.Repository;

import com.springtutorial.dao.ProductDao;
import com.springtutorial.entity.Product;

@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product, String> implements ProductDao {

}
