package com.springDemo.Constructor_Injection;

import java.util.List;

public class Person {
	private int pid;
	private String name;
	private Certificate cert;
	private List<String> list;

	public Person(int pid, String name, Certificate cert, List<String> list) {
		this.pid = pid;
		this.name = name;
		this.cert = cert;
		this.list = list;
	}

	@Override
	public String toString() {
		return this.pid + " : " + this.name + "\n { " + this.cert.name + " }" + "\nList : " + this.list;
	}

}
