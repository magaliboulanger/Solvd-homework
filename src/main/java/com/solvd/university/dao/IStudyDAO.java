package com.solvd.university.dao;



import com.solvd.university.model.Study;

public interface IStudyDAO extends DAO<Study, Long>{
	boolean save(Study b);
	long getStudentId(long id);
	long getTeachId(long id);
}
