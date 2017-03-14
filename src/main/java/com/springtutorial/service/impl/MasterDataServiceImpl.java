package com.springtutorial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtutorial.dao.CategoryDao;
import com.springtutorial.entity.Category;
import com.springtutorial.service.MasterDataService;

@Service
public class MasterDataServiceImpl implements MasterDataService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public List<Category> getAllCategory() {
		return categoryDao.getAll();
	}

}
