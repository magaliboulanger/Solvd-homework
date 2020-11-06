package com.solvd.university.dao;

import com.solvd.connectionpool.MyConnectionPool;

public abstract class MySQLDAO {

	private MyConnectionPool connection;

	public MySQLDAO(MyConnectionPool connection) {
		this.connection = connection;
	}
	
	
	
}
