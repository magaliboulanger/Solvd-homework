package com.solvd.university.dao;



import java.util.List;

import com.solvd.university.model.Book;

public interface IBookDAO extends DAO<Book,Long>{

	long save(Book b, long idLib);

	List<Book> getByLibId(Long id);
	
}
