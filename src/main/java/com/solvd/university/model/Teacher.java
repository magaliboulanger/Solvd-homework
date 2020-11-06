package com.solvd.university.model;

public class Teacher extends AbstractEntity {
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

	private String name;
	private String phone;
	private String email;
	
	public Teacher(long id, String name, String phone, String email) {
		super(id);
		this.name = name;
		this.phone = phone;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
}
