package com.solvd.university.model;

public class Library extends AbstractEntity {

	private String name;
	private String address;
	
	public Library(long id, String name, String address) {
		super(id);
		this.name = name;
		this.address = address;
	}
	
	
}
