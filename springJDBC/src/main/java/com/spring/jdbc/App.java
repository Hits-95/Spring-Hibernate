package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {

	public static void main(String[] args) {

		// using XML
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/spring/jdbc/data_confg.xml");

		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		// get query fire object
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// get data for insert

		/*
		 * Student student = context.getBean("student1", Student.class);
		 * 
		 * int insert = studentDao.insert(student);
		 * System.out.println("no of data insert : " + insert);
		 */

		// update Student

		/*
		 * Student student = new Student();
		 * 
		 * student.setId(5); student.setNaem("Shamal Mahale");
		 * student.setCity("At Malegaon Nashik");
		 * 
		 * //fire int update = studentDao.update(student);
		 * System.out.println("No of record update : " + update);
		 */

		// Delete Student
		/*
		 * int delete = studentDao.delete(4);
		 * System.out.println("No of record deleted : " + delete);
		 * 
		 */

		// Select opration

		/*
		 * // get single student data Student student = studentDao.getStudent(1);
		 * System.out.println("Single Student data : " + student);
		 * 
		 */

		// list of student
		List<Student> allStudents = studentDao.getAllStudents();
		System.out.println("All students \n--------------------------------------------------------");

		for (Student stud : allStudents)
			System.out.println(stud);

	}
}
