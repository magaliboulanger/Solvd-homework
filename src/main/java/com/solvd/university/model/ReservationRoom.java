package com.solvd.university.model;

import java.util.Date;

public class ReservationRoom extends AbstractEntity {

	private Room r;
	private Teacher t;
	private Date start;
	private Date finish;
	public ReservationRoom(long id, Room r, Teacher t, Date start, Date finish) {
		super(id);
		this.r = r;
		this.t = t;
		this.start = start;
		this.finish = finish;
	}
}
