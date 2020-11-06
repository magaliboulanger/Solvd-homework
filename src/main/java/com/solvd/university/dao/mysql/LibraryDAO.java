package com.solvd.university.dao.mysql;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.ILibraryDAO;

public class LibraryDAO extends MySQLDAO implements ILibraryDAO {

	public LibraryDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

}
