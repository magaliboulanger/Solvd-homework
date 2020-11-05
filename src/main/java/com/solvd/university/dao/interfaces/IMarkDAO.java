package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Mark;

public interface IMarkDAO {
	boolean save(Mark b);
	boolean removeById(long id);
	Mark getById(long id);
	ArrayList<Mark> getAll();

}
