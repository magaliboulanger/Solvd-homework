package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.ReservationRoom;

public interface IReservationRoomDAO {
	boolean save(ReservationRoom b);
	boolean removeById(long id);
	ReservationRoom getById(long id);
	List<ReservationRoom> getAll();
}
