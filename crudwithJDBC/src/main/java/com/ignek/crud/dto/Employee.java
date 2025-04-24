package com.ignek.crud.dto;

public class Employee {
	private int id;
	private String fullName;
	private String email;
	private String gender;
	private String dob;

	public Employee(int id, String name, String email, String gender, String dob) {
		this.id = id;
		this.fullName = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}

	public Employee(String name, String email, String gender, String dob) {
		super();
		this.fullName = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getDob() {
		return dob;
	}

}
