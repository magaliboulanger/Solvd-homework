package com.solvd.university.model;

import java.util.ArrayList;
import java.util.Date;

public class Building extends AbstractEntity  {

	private String name;
	private String location;
	private Date creationDate;
	private ArrayList<Room> rooms;
	
	public Building(long id, String name, String location, Date creationDate, ArrayList<Room> rooms) {
		super(id);
		this.name = name;
		this.location = location;
		this.creationDate = creationDate;
		this.rooms = rooms;
	}
	
	
}
