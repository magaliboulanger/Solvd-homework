package com.solvd.university.services;

import com.solvd.university.dao.interfaces.IDepartmentDAO;
import com.solvd.university.dao.interfaces.ITeacherDAO;
import com.solvd.university.model.Department;

public class DepartmentService {
	private ITeacherDAO Tdao;
	private IDepartmentDAO Ddao;
	
	public DepartmentService(ITeacherDAO tdao, IDepartmentDAO d) {
		super();
		Ddao = d; 
		Tdao = tdao;
	}

	public Department getById(long id) {
		
		Department d = Ddao.getById(id);
		d.setTeachers(Tdao.getByDepartmentId(d.getId()));
		return d;
		
	}
}
