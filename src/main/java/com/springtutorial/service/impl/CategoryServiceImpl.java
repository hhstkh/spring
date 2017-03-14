package com.springtutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtutorial.dao.CategoryDao;
import com.springtutorial.dao.GenericDao;
import com.springtutorial.entity.Category;
import com.springtutorial.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl extends GenericServiceImpl<Category, Integer> implements CategoryService {
	private CategoryDao categoryDao;
	
	
	@Autowired
	public CategoryServiceImpl(@Qualifier("categoryDaoImpl") GenericDao<Category, Integer> genericDao) {
		super(genericDao);
		this.categoryDao = (CategoryDao)genericDao;
	}
}
