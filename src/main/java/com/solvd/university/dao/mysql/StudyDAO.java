package com.solvd.university.dao.mysql;

import java.util.ArrayList;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.IStudyDAO;
import com.solvd.university.model.Study;

public class StudyDAO extends MySQLDAO implements IStudyDAO {

	public StudyDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Study b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Study getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Study> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
