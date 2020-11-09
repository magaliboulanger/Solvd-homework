package com.solvd.university.dao.mysql;

import java.util.List;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.IRoomDAO;
import com.solvd.university.model.Room;

public class RoomDAO extends MySQLDAO implements IRoomDAO{

	public RoomDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(Room b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Room getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Room> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
