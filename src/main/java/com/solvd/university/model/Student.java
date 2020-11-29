package com.solvd.university.model;

public class Student extends Person {

	private int universityIdentifier;
	
	public Student(long id, String name, String phone, Address address, int ui) {
		super(id, name, phone, address);
		this.universityIdentifier=ui;
	}

	public int getUniversityIdentifier() {
		return universityIdentifier;
	}

	public void setUniversityIdentifier(int universityIdentifier) {
		this.universityIdentifier = universityIdentifier;
	}

	
	
}
