package com.solvd.university.model;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
@XmlRootElement 
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

	public Book() {
		super();
		this.title = null;
		this.author = null;
		this.num_pages = 0;
		this.year = 0;
	}
	
	@XmlElement(name="title") 
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", num_pages=" + num_pages + ", year=" + year + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@XmlElement(name="author") 
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@XmlElement(name="numPages") 
	public int getNum_pages() {
		return num_pages;
	}

	public void setNum_pages(int num_pages) {
		this.num_pages = num_pages;
	}

	@XmlElement(name="year") 
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
