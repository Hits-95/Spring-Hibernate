package com.hibernate.HibernateDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating student
		Student student = new Student(1, "Hitesh Ahire", "@Dabli, Malegaon, Nashi");
		System.out.println(student);
		
		//creating object of Address
		Address address = new Address();
		address.setStreet("street1");
		address.setCity("Nashik");
		address.setOpen(false);
		address.setAddedDate(new Date());
		address.setBill(12313.12);
		
		//Reading File
		FileInputStream fis = new FileInputStream("src/main/java/iron.jpeg"); 
		byte[] data = new byte[fis.available()];
		fis.read(data);
		address.setImage(data);
		
		
		//Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(student);
		session.save(address);
		tx.commit();
		
		session.close();
		System.out.println("Done.....");
		/*
		 * System.out.println(factory); System.out.println(factory.isOpen());
		 * System.out.println(factory.isClosed());
		 */
	}
}
