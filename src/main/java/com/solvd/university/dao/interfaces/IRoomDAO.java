package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Room;

public interface IRoomDAO {

	boolean save(Room b);
	boolean removeById(long id);
	Room getById(long id);
	ArrayList<Room> getAll();
}
