package com.solvd.university.dao;


import com.solvd.university.model.Mark;

public interface IMarkDAO extends DAO<Mark, Long>{
	boolean save(Mark b);

}
