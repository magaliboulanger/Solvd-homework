package com.solvd.university.model;

import java.util.List;

public class Library extends AbstractEntity {

	private String name;
	private String address;
	private List<Book> books;
	public Library(long id, String name, String address, List<Book> b) {
		super(id);
		this.name = name;
		this.address = address;
		this.books=b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", address=" + address + ", books=" + books + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
