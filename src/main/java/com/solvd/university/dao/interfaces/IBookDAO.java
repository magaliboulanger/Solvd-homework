package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Book;

public interface IBookDAO {

	boolean save(Book b);
	boolean removeById(long id);
	Book getById(long id);
	ArrayList<Book> getAll();
}
