package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Mark;

public interface IMarkDAO {
	boolean save(Mark b);
	boolean removeById(long id);
	Mark getById(long id);
	List<Mark> getAll();

}
