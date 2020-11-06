package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Student;

public interface IStudentDAO {

	public boolean save(Student b);
	public boolean removeById(long id);
	public Student getById(long id);
	public ArrayList<Student> getAll();
}
