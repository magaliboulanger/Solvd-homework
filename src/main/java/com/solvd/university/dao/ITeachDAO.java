package com.solvd.university.dao;


import com.solvd.university.model.Teach;

public interface ITeachDAO extends DAO<Teach, Long>{
	boolean save(Teach b);
	
	long getSubjIdById(long id);
	long getTeacherIdById(long id);
}
