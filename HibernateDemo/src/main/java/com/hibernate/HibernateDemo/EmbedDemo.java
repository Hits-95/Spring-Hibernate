package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
public class EmbedDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// student 1
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Hitesh Ahire");
		student1.setCity("@Dabli post kashti");

		Certificate certificate1 = new Certificate("Android", "3 months");
		student1.setCerti(certificate1);

		// student2
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Shubham Jagtap");
		student2.setCity("@Dabli post kashti");

		Certificate certificate2 = new Certificate("Java Spring Boot", "4 months");
		student2.setCerti(certificate2);
		
		//save data in datbase
		Session session = factory.openSession();
		
		//for permanate save use this.
		Transaction transaction = session.beginTransaction();
		
		//save object in database
		session.save(student1);
		session.save(student2);
		transaction.commit();
		
		//close
		session.close();
		factory.close();
	}

}
