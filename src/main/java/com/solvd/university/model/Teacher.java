package com.solvd.university.model;

public class Teacher extends AbstractEntity {
	private String name;
	private String phone;
	private String email;
	
	public Teacher(long id, String name, String phone, String email) {
		super(id);
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	

	
}
