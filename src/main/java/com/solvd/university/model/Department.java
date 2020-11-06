package com.solvd.university.model;

import java.util.ArrayList;

public class Department extends AbstractEntity {
	private String name;
	private ArrayList<Teacher> teachers;
	public Department(long id, String name, ArrayList<Teacher> teachers) {
		super(id);
		this.name = name;
		this.teachers=teachers;
	}
	
}
