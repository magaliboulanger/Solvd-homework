package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.ReservationRoom;

public interface IReservationRoomDAO {
	boolean save(ReservationRoom b);
	boolean removeById(long id);
	ReservationRoom getById(long id);
	ArrayList<ReservationRoom> getAll();
}
