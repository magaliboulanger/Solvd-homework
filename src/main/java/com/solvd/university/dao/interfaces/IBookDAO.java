package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Book;

public interface IBookDAO {

	public boolean save(Book b);
	public boolean removeById(long id);
	public Book getById(long id);
	public ArrayList<Book> getAll();
}
