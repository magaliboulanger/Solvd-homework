package com.solvd.university.services;

import com.solvd.university.dao.*;
import com.solvd.university.dao.mysql.*;
import com.solvd.university.model.*;

public class TeacherService {

	private ITeacherDAO tdao;
	private IPersonDAO pdao;
	private IAddressDAO adao;
	
	public TeacherService() {
		this.tdao = new TeacherDAO();
		this.pdao = new PersonDAO();
		this.adao = new AddressDAO();
	}
	
	public Teacher getById(Long id) {
		Teacher teacher = tdao.getById(id);
		Person person = pdao.getById(id);
		teacher.setAddress();
	}
}
