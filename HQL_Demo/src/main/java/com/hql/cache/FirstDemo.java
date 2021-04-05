package com.hql.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.entity.Person;

public class FirstDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Person person = session.load(Person.class, 1);
		System.out.println(person);
		
		System.out.println("_______________________________");
		
		Person person1 = session.load(Person.class, 1);
		System.out.println(person1);
		
		System.out.println(session.contains(person));
		
		session.close();
		factory.close();
		
	}

}
