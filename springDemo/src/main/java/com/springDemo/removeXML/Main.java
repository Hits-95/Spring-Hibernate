package com.springDemo.removeXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// get object using @annotation..
		Student student = context.getBean("myStudent", Student.class);
		System.out.println(student);
		student.demo();

		System.out.println("++++++++++++++++++++++++++++++++");

		// get object using meethod which has written in JavaConfig class Student
		Student student1 = context.getBean("getStudent", Student.class);
		System.out.println(student1);
		student1.demo();

	}

}
