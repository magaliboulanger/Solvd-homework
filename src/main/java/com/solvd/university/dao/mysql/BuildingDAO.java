package com.solvd.university.dao.mysql;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IBuildingDAO;

public class BuildingDAO extends MySQLDAO implements IBuildingDAO{


	public BuildingDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

}
