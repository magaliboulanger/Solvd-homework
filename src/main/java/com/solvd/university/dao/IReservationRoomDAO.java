package com.solvd.university.dao;


import com.solvd.university.model.ReservationRoom;
public interface IReservationRoomDAO extends DAO<ReservationRoom, Long> {
	boolean save(ReservationRoom b);
}
