package com.solvd.university.model;

public class Student extends AbstractEntity {
	private String name;
	private String phone;
	private String address;
	public Student(long id, String name, String phone, String address) {
		super(id);
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
}
