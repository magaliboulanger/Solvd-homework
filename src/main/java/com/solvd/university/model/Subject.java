package com.solvd.university.model;

public class Subject extends AbstractEntity {
	private String name;
	private int hours;
	private int credits;
	public Subject(long id, String name, int hours, int credits) {
		super(id);
		this.name = name;
		this.hours = hours;
		this.credits = credits;
	}
	
}
