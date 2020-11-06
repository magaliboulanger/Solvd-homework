package com.solvd.university.dao.mysql;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IMarkDAO;

public class MarkDAO extends MySQLDAO implements IMarkDAO {

	public MarkDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

}
