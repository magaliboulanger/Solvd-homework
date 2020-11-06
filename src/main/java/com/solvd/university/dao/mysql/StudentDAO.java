package com.solvd.university.dao.mysql;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IStudentDAO;

public class StudentDAO extends MySQLDAO implements IStudentDAO{

	public StudentDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

}
