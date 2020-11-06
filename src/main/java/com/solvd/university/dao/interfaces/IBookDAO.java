package com.solvd.university.dao.interfaces;



import java.util.List;

import com.solvd.university.model.Book;

public interface IBookDAO {

	boolean save(Book b, long idLib);
	boolean removeById(long id);
	Book getById(long id);
	List<Book> getAll();
	List<Book> getByLibId(long id);
}
