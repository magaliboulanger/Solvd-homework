package com.solvd.university.dao.mysql;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IRoomDAO;

public class RoomDAO extends MySQLDAO implements IRoomDAO{

	public RoomDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

}
