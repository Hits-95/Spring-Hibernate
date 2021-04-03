package com.spring.jdbc.entites;

public class Student {

	private int id;
	private String naem;
	private String city;

	public Student() {
	}

	public Student(int id, String naem, String city) {
		super();
		this.id = id;
		this.naem = naem;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaem() {
		return naem;
	}

	public void setNaem(String naem) {
		this.naem = naem;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", naem=" + naem + ", city=" + city + "]";
	}

}
