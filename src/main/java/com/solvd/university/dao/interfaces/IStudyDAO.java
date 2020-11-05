package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Study;

public interface IStudyDAO {
	boolean save(Study b);
	boolean removeById(long id);
	Study getById(long id);
	ArrayList<Study> getAll();
}
