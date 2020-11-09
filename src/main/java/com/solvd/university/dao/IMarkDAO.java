package com.solvd.university.dao;


import com.solvd.university.model.Mark;

public interface IMarkDAO extends DAO<Mark, Long>{
	long save(Mark b);

}
