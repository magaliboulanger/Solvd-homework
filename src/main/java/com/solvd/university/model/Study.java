package com.solvd.university.model;

import java.util.ArrayList;

public class Study  extends AbstractEntity {

	private Student student;
	private ArrayList<Exam> exams;
	public Study(long id, Student student, ArrayList<Exam> exams) {
		super(id);
		this.student = student;
		this.exams = exams;
	}
	
	
}
