package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Exam;

public interface IExamDAO {
	boolean save(Exam b);
	boolean removeById(long id);
	Exam getById(long id);
	ArrayList<Exam> getAll();
}
