package com.springtutorial.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtutorial.dao.GenericDao;
import com.springtutorial.service.GenericService;

@Service
public abstract class GenericServiceImpl<E, K extends Serializable> implements GenericService<E, K>{

	private GenericDao<E, K> genericDao;
	
	public GenericServiceImpl(GenericDao<E, K> genericDao) {
		this.genericDao = genericDao;
	}

	public GenericServiceImpl() {
	}

	@Override
	public void saveOrUpdate(E entity) {
		genericDao.saveOrUpdate(entity);
		
	}

	@Override
	public void delete(E entity) {
		genericDao.delete(entity);
		
	}

	@Override
	public E find(K key) {
		return genericDao.find(key);
	}

	@Override
	public List<E> getAll() {
		return genericDao.getAll();
	}

}
