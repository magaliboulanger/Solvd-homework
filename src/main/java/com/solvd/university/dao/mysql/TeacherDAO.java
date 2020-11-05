package com.solvd.university.dao.mysql;

import java.util.ArrayList;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.ITeacherDAO;
import com.solvd.university.model.Teacher;

public class TeacherDAO extends MySQLDAO  implements ITeacherDAO{

	public TeacherDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Teacher b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Teacher> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
