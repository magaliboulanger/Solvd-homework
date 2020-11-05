package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.ReservationBook;

public interface IReservationBookDAO {
	boolean save(ReservationBook b);
	boolean removeById(long id);
	ReservationBook getById(long id);
	ArrayList<ReservationBook> getAll();
}
