package com.solvd.university.model;

public class Subject extends AbstractEntity {
	private String name;
	private int hours;
	private int credits;
	public Subject(long id, String name, int hours, int credits) {
		super(id);
		this.name = name;
		this.hours = hours;
		this.credits = credits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", hours=" + hours + ", credits=" + credits + "]";
	}
	
	
}
