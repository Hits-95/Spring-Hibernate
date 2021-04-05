package com.hql.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.entity.Person;

public class SecondCacheDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("").buildSessionFactory();

		// session one
		Session session1 = factory.openSession();
		Person person1  = session1.get(Person.class, 1);
		System.out.println(person1);
	
		System.out.println();

		session1.close();

		// session 2
		Session session2 = factory.openSession();
		Person person2 = session2.get(Person.class, 1);
		System.out.println(person2);
	

		session2.close();
		factory.close();

	}

}
