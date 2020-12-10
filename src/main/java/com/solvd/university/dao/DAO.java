package com.solvd.university.dao;

import java.util.List;
import java.util.Optional;

import com.solvd.university.model.Address;
import com.solvd.university.model.Book;


public interface DAO<T,K> {
	boolean removeById(K id);
	Optional<T> getById(K id);
	List<T> getAll();
}
