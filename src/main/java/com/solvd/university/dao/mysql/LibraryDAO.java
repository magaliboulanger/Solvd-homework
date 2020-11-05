package com.solvd.university.dao.mysql;

import java.util.ArrayList;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.ILibraryDAO;
import com.solvd.university.model.Library;

public class LibraryDAO extends MySQLDAO implements ILibraryDAO {

	public LibraryDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Library b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Library getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Library> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
