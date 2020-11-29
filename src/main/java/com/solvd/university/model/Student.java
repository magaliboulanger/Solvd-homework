package com.solvd.university.model;

public class Student extends Person {

	private int universityIdentifier;
	
	public Student(long id, String name, String phone, String address, int ui) {
		super(id, name, phone, address);
		this.universityIdentifier=ui;
	}

	
	
}
