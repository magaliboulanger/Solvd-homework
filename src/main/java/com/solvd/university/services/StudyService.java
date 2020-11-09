package com.solvd.university.services;

import com.solvd.university.dao.*;
import com.solvd.university.model.*;

public class StudyService {
	private ITeachDAO Tdao;
	private ITeacherDAO Tedao;
	private IExamDAO Edao;
	private IStudentDAO Sdao;
	private ISubjectDAO Sudao;
	private IStudyDAO StuDAO;
	public StudyService(ITeachDAO tdao, ISubjectDAO sudao, ITeacherDAO tedao, IExamDAO edao, IStudentDAO sdao, IStudyDAO stdao) {
		super();
		Tdao = tdao;
		Edao = edao;
		Sdao = sdao;
		StuDAO = stdao;
		Tedao= tedao;
		Sudao = sudao;
	}
	public Study getById(long id) {
		Study out =StuDAO.getById(id);
		TeachService t=new TeachService(Tedao, Tdao,Sudao);
		out.setTeach(t.getById(StuDAO.getTeachId(id)));
		out.setStudent(Sdao.getById(StuDAO.getStudentId(id)));
		out.setExams(Edao.getByStudyId(id));
		return out;
		
	}
}
