package com.solvd.university.dao;


import com.solvd.university.model.Student;

public interface IStudentDAO extends DAO<Student, Long> {

	long save(Student b);
}
