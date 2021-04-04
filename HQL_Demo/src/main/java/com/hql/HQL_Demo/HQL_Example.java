package com.hql.HQL_Demo;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hql.entity.Person;

public class HQL_Example {
	
	public static void main(String[] argv) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		// HQL fire
		//String query = "from Person";
		//String query = "from Person where city = 'Dhule'";
		
		//String query = "from Person where city = :data";
		
		//alias
		String query = "from Person as p where p.city =: data1 and p.name =: data2";		
		
		Query Q_obj = session.createQuery(query);
		
		Q_obj.setParameter("data1", "Dhule");
		Q_obj.setParameter("data2", "Nikita");
		//single result - unique
		//Q_obj.uniqueResult();
		
		//multiple result - list
		List<Person> list = Q_obj.list();
		for(Person p : list)
			System.out.println(p);
		
		//delete opration
		/*System.out.println("_____________________________________");
		Transaction tx = session.beginTransaction();
		Query Q_obj1 = session.createQuery("delete from Person as p where p.city =: data");
		Q_obj1.setParameter("data", "@Dabli");
		
		int result = Q_obj1.executeUpdate();
		
		System.out.println("deleted : "+result);
		
		tx.commit();*/
		
		//update oopration
		/*Transaction tx = session.beginTransaction();
		Query Q_obj1 = session.createQuery("update Person set city =: newData where name =: data");
		Q_obj1.setParameter("newData", "Pachora");
		Q_obj1.setParameter("data", "Nikita");
		int result =  Q_obj1.executeUpdate();
		System.out.println("updated : " + result);
		tx.commit();
		*/
		
		//join Query
		Query Q_obj1 = session.createQuery("select q.questionId, q.question, a.answer from Question as q INNER JOIN q.answers as a");
		List<Object[]> ls = Q_obj1.getResultList();
		for(Object[] arr : ls)
			System.out.println(Arrays.toString(arr));
		
		
		
		
		/*// Session session = factory.getCurrentSession();
		
		Transaction tx = session.beginTransaction();

		//add into database
		Person person = new Person(1, "Hitesh Ahire", "@Dabli ");
		
		
		session.save(person);
		tx.commit();*/
		
		session.close();
		factory.close();
	}
}
