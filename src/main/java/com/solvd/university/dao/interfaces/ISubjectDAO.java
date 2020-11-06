package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Subject;


public interface ISubjectDAO {
	boolean save(Subject b);
	boolean removeById(long id);
	Subject getById(long id);
	List<Subject> getAll();
}
