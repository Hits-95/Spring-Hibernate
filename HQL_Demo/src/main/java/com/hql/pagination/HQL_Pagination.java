package com.hql.pagination;

import org.hibernate.query.Query;

import java.util.ArrayList;
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
		query.setFirstResult(5);
		query.setMaxResults(5);
		
		//get list
		List<Person> list = query.getResultList();
		
		for(Person person : list)
			System.out.println(person);
			
		List<String> list1 = new ArrayList<String>();
		
		list1.add("hitesh");
		list1.add("bhagawam");
		list1.add("ahire");
		list1.add("kaka");
		list1.add("dabli");
		list1.add("shubham");
		list1.add("vrushali");
		list1.add("ganesh");
		
		session.close();
		factory.close();
	}
}
