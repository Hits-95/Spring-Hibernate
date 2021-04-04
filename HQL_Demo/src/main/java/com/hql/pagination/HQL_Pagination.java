package com.hql.pagination;

import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.entity.Person;

public class HQL_Pagination {

	public static void main(String[] argv) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Query<Person> query = session.createQuery("from Person", Person.class);
		
		//implimate pagination using hibernate
		query.setFirstResult(0);
		query.setMaxResults(5);
		
		//get list
		List<Person> list = query.getResultList();
		
		for(Person person : list)
			System.out.println(person);
			
		
		
		session.close();
		factory.close();
	}
}
