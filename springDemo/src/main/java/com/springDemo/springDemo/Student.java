package com.springDemo.springDemo;

public class Student {
	private int rollno;
	private String name;
	private String addr;
	
	//constructer...
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}
	
	//getters...
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	
	//setters...
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", addr=" + addr + "]";
	}
	
}
