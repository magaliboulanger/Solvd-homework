package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Mark;

public interface IMarkDAO {
	public boolean save(Mark b);
	public boolean removeById(long id);
	public Mark getById(long id);
	public ArrayList<Mark> getAll();

}
