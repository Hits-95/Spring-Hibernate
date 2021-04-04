package com.SQL_Query;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;


public class SQL_Example {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		//SQL Query
		String q = "SELECT * FROM `person`";
		
		//it return object[] data not a person
		NativeQuery createSQLQuery = session.createSQLQuery(q);
		
		List<Object[]> list = createSQLQuery.list();
		
		for(Object[] person : list)
			System.out.println(Arrays.toString(person));
		
		list.forEach(person -> System.out.println(Arrays.toString(person)));
		
		session.close();
		factory.close();
	}

}
