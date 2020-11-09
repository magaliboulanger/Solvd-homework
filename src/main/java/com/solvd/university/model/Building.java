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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	
}
