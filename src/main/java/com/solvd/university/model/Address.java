package com.solvd.university.model;

public class Address extends AbstractEntity {

	private String addr;
	private int coords;
	public Address(long id, String addr, int coor) {
		super(id);
		this.addr = addr;
		this.coords = coor;
	}
	
}
