package com.springtutorial.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springtutorial.dao.GenericDao;

@Repository
@Transactional
public abstract class GenericDaoImpl<E, K extends Serializable> implements GenericDao<E, K>{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Class<? extends E> clazz;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType)t;
		this.clazz = (Class)pt.getActualTypeArguments()[0];
	}
	
	public GenericDaoImpl(Class<E> clazz) {
		this.clazz = clazz;
	}
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(E entity) {
		getSession().saveOrUpdate(entity);
	}

	@Override
	public void update(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(E entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E find(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<E> getAll() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(clazz).list();
	}
	
	protected Criteria creatteEntittyCriteia() {
		return getSession().createCriteria(this.clazz);
	}
}
