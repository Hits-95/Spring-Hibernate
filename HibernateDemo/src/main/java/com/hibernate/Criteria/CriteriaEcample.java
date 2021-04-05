package com.hibernate.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.HibernateDemo.Student;

public class CriteriaEcample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		//create criteria 
		Criteria criteria = session.createCriteria(Student.class);
		
		criteria.add(Restrictions.eq("city", "nashik"));
		
		List<Student> list = criteria.list();
		list.forEach(stu -> System.out.println(stu));
		
		
		session.close();
		factory.close();
	}

}
