package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Teach;

public interface ITeachDAO {
	boolean save(Teach b);
	boolean removeById(long id);
	Teach getById(long id);
	List<Teach> getAll();
	long getSubjIdById(long id);
	long getTeacherIdById(long id);
}
