package com.solvd.university.model;

public class Book extends AbstractEntity {
	private String title;
	private String author;
	private int num_pages;
	private int year;
	
	public Book(long id, String title, String author, int num_pages, int year) {
		super(id);
		this.title = title;
		this.author = author;
		this.num_pages = num_pages;
		this.year = year;
	}
	
}
