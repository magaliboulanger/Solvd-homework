package com.solvd.university.dao.interfaces;


import java.util.List;

import com.solvd.university.model.Study;

public interface IStudyDAO {
	boolean save(Study b);
	boolean removeById(long id);
	Study getById(long id);
	List<Study> getAll();
	long getStudentId(long id);
	long getTeachId(long id);
}
