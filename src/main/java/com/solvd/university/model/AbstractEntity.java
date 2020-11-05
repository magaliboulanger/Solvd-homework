package com.solvd.university.model;

public abstract class AbstractEntity {
	private long id;

	public AbstractEntity(long id) {
		super();
		this.id = id;
	}
	
	public AbstractEntity() {
		this.id=-1;
	}
	
}
