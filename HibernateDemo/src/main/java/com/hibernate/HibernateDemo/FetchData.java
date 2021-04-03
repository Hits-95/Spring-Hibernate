package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		// get Student information
		Student student = session.load(Student.class, 2);
		System.out.println("Student : " + student);

		// get Address table information
		Address address = session.get(Address.class, 1);
		System.out.println("Address : " + address);

		session.close();
		factory.close();

	}

}
