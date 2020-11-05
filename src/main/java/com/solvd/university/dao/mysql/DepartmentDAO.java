package com.solvd.university.dao.mysql;

import java.util.ArrayList;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IDepartmentDAO;
import com.solvd.university.model.Department;

public class DepartmentDAO extends MySQLDAO implements IDepartmentDAO{

	public DepartmentDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Department b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Department getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Department> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
