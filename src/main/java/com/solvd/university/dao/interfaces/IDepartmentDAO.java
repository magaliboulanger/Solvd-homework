package com.solvd.university.dao.interfaces;

import java.util.ArrayList;

import com.solvd.university.model.Department;

public interface IDepartmentDAO {
	public boolean save(Department b);
	public boolean removeById(long id);
	public Department getById(long id);
	public ArrayList<Department> getAll();
}
