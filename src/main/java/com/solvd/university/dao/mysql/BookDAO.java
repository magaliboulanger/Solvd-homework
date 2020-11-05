package com.solvd.university.dao.mysql;

import java.util.ArrayList;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IBookDAO;
import com.solvd.university.model.Book;

public class BookDAO extends MySQLDAO implements IBookDAO {

	public BookDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Book b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
