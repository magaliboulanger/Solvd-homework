package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Teach;

public interface ITeachDAO {
	boolean save(Teach b);
	boolean removeById(long id);
	Teach getById(long id);
	ArrayList<Teach> getAll();
}
