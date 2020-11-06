package com.solvd.university.dao.interfaces;

import java.util.List;

import com.solvd.university.model.Exam;

public interface IExamDAO {
	boolean save(Exam b, long stuId);
	boolean removeById(long id);
	Exam getById(long id);
	List<Exam> getAll();
	List<Exam> getByStudyId(long id);
}
