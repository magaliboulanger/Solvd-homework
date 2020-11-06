package com.solvd.university.model;

public class Student extends AbstractEntity {
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	private String name;
	private String phone;
	private String address;
	public Student(long id, String name, String phone, String address) {
		super(id);
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
