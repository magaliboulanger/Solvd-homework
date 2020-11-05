package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Department;

public interface IDepartmentDAO {
	boolean save(Department b);
	boolean removeById(long id);
	Department getById(long id);
	ArrayList<Department> getAll();
}
