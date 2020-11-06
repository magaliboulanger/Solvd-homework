package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Teacher;

public interface ITeacherDAO {

	public boolean save(Teacher b);
	public boolean removeById(long id);
	public Teacher getById(long id);
	public ArrayList<Teacher> getAll();
}
