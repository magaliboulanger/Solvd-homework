package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Teacher;

public interface ITeacherDAO {

	boolean save(Teacher b, long idDepartment);
	boolean removeById(long id);
	Teacher getById(long id);
	ArrayList<Teacher> getAll();
	ArrayList<Teacher> getByDepartmentId(long id);
}
