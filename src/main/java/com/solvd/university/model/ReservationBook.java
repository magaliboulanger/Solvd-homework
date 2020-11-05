package com.solvd.university.model;

import java.util.Date;

public class ReservationBook extends AbstractEntity {
	private Book book;
	private Student student;
	private Date date;
	private Date end;
	public ReservationBook(long id, Book book, Student student, Date date, Date end) {
		super(id);
		this.book = book;
		this.student = student;
		this.date = date;
		this.end = end;
	}
	
	
}
