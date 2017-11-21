package com.springtutorial.service;

import java.util.List;

public interface GenericService<E, K> {
	void saveOrUpdate(E entity);
	void delete(E entity);
	E find(K key);
	List<E> getAll();
}
