package com.solvd.university.model;

import java.util.List;

public class Study  extends AbstractEntity {

	private Student student;
	private List<Exam> exams;
	public Study(long id, Student student, List<Exam> exams) {
		super(id);
		this.student = student;
		this.exams = exams;
	}
	
	
}
