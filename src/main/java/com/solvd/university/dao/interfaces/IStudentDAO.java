package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Student;

public interface IStudentDAO {

	boolean save(Student b);
	boolean removeById(long id);
	Student getById(long id);
	List<Student> getAll();
}
