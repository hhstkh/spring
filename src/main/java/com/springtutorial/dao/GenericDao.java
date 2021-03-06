package com.springtutorial.dao;

import java.util.List;

public interface GenericDao<E, K> {
	void saveOrUpdate(E entity);
	void delete(E entity);
	E find(K key);
	List<E> getAll();
}
