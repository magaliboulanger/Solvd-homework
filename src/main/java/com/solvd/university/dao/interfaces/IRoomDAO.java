package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Room;

public interface IRoomDAO {

	boolean save(Room b);
	boolean removeById(long id);
	Room getById(long id);
	List<Room> getAll();
}
