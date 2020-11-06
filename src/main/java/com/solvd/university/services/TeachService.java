package com.solvd.university.services;

import com.solvd.university.dao.interfaces.*;
import com.solvd.university.model.Teach;

public class TeachService {
	private ITeacherDAO Tdao;
	private ITeachDAO Tedao;
	private ISubjectDAO Sdao;
	public TeachService(ITeacherDAO tdao,ITeachDAO TeDAO, ISubjectDAO sdao) {
		super();
		Tdao = tdao;
		Sdao = sdao;
		Tedao = TeDAO;
	}
	
	public Teach getById(long id) {
		Teach out=Tedao.getById(id);
		out.setSubject(Sdao.getById(Tedao.getSubjIdById(id)));
		out.setTeacher(Tdao.getById(Tedao.getTeacherIdById(id)));
		return out;
	}
}
