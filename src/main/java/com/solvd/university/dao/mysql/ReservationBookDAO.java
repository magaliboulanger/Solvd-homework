package com.solvd.university.dao.mysql;

import java.util.ArrayList;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.MySQLDAO;
import com.solvd.university.dao.interfaces.IReservationBookDAO;
import com.solvd.university.model.ReservationBook;

public class ReservationBookDAO extends MySQLDAO implements IReservationBookDAO{

	public ReservationBookDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(ReservationBook b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReservationBook getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ReservationBook> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
