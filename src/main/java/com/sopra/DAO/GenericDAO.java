package com.sopra.DAO;

import java.util.List;

public interface GenericDAO<T, K> {
	List<T> findAll();

	T findByID(K id);

	T insert(T obj);

	void update(T obj);

	void deleteByID(K id);
}
