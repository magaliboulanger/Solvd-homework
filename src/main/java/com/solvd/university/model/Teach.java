package com.solvd.university.model;

public class Teach extends AbstractEntity{
	private Teacher teacher;
	private Subject subject;
	public Teach(long id, Teacher teacher, Subject subject) {
		super(id);
		this.teacher = teacher;
		this.subject = subject;
	}
}
