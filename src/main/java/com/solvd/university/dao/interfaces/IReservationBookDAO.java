package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.ReservationBook;

public interface IReservationBookDAO {
	boolean save(ReservationBook b);
	boolean removeById(long id);
	ReservationBook getById(long id);
	List<ReservationBook> getAll();
}
