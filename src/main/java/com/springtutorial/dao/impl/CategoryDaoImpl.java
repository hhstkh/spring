package com.springtutorial.dao.impl;

import org.springframework.stereotype.Repository;

import com.springtutorial.dao.CategoryDao;
import com.springtutorial.entity.Category;

@Repository
public class CategoryDaoImpl extends GenericDaoImpl<Category, Integer> implements
		CategoryDao {

	

}
