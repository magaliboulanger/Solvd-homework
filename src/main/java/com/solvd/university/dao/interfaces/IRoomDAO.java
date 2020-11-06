package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Room;

public interface IRoomDAO {

	public boolean save(Room b);
	public boolean removeById(long id);
	public Room getById(long id);
	public ArrayList<Room> getAll();
}
