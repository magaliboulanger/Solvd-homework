package com.solvd.university.model;

public class Room extends AbstractEntity {

	private int capacity;
	private int number;
	public Room(long id, int capacity, int number) {
		super(id);
		this.capacity = capacity;
		this.number = number;
	}
	
	
}
