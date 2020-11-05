package com.solvd.university.model;

import java.util.Date;

public class Exam  extends AbstractEntity {
	private char mark;
	private Date date;
	public Exam(long id, char mark, Date date) {
		super(id);
		this.mark = mark;
		this.date = date;
	}
	
}
