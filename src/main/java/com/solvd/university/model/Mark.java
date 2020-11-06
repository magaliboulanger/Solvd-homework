package com.solvd.university.model;

public class Mark extends AbstractEntity {

	private String mark;
	private float numberMark;
	
	public Mark(long id, String mark, float numberMark) {
		super(id);
		this.mark = mark;
		this.numberMark = numberMark;
	}
	
	
}
