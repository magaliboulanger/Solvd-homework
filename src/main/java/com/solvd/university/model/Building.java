package com.solvd.university.model;

import java.util.Date;
import java.util.List;

public class Building extends AbstractEntity  {

	private String name;
	private String location;
	private Date creationDate;
	private List<Room> rooms;
	
	public Building(long id, String name, String location, Date creationDate, List<Room> rooms) {
		super(id);
		this.name = name;
		this.location = location;
		this.creationDate = creationDate;
		this.rooms = rooms;
	}
	
	
}
