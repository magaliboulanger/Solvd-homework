package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Teacher;

public interface ITeacherDAO {

	boolean save(Teacher b, long idDepartment);
	boolean removeById(long id);
	Teacher getById(long id);
	List<Teacher> getAll();
	List<Teacher> getByDepartmentId(long id);
}
