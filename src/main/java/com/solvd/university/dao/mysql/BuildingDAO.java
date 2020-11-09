package com.solvd.university.dao.mysql;

import java.util.List;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.IBuildingDAO;
import com.solvd.university.model.Building;

public class BuildingDAO extends MySQLDAO implements IBuildingDAO{


	public BuildingDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Building b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Building getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Building> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
