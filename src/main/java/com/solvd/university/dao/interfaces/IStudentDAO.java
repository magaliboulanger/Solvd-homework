package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Student;

public interface IStudentDAO {

	boolean save(Student b);
	boolean removeById(long id);
	Student getById(long id);
	ArrayList<Student> getAll();
}
