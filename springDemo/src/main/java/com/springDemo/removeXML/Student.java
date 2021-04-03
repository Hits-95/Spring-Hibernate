package com.springDemo.removeXML;

import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void demo() {
		samosa.display();
		System.out.println("Student doing Study of java spring");
	}
}
