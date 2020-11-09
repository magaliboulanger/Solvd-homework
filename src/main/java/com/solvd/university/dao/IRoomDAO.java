package com.solvd.university.dao;


import com.solvd.university.model.Room;

public interface IRoomDAO extends DAO<Room, Long>{

	long save(Room b);

}
