package com.solvd.university.services;

import com.solvd.university.dao.*;
import com.solvd.university.dao.mysql.*;
import com.solvd.university.model.Department;

public class DepartmentService {
	private TeacherService ts;
	private IDepartmentDAO dDao;
	
	public DepartmentService() {
		super();
		this.dDao = new DepartmentDAO(); 
		this.ts = new TeacherService();
	}

	public Department getById(long id) {
		
		Department d = dDao.getById(id);
		d.setTeachers(ts.getByDepartmentId(d.getId()));
		return d;
		
	}
}
