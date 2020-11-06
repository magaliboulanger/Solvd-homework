package com.solvd.university.dao.mysql;

import java.util.List;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.IMarkDAO;
import com.solvd.university.model.Mark;

public class MarkDAO extends MySQLDAO implements IMarkDAO {

	public MarkDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Mark b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Mark getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Mark> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
