package com.solvd.university.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;



@XmlRootElement (name="library") 
@XmlAccessorType(XmlAccessType.FIELD)
public class Library extends AbstractEntity {
	@XmlElement(name="name") 
	private String name;
	@XmlElement(name="address") 
	private Address address;
	@XmlElement(name="book") 
	private List<Book> books;
	
	public Library(long id, String name, Address address, List<Book> b) {
		super(id);
		this.name = name;
		this.address = address;
		this.books=b;
	}
	
	public Library() {
		super();
		this.name = null;
		this.address = null;
		this.books = null;
	}
	
	public Library(long id, String name) {
		super(id);
		this.name = name;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
