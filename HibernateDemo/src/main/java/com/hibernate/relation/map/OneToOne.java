package com.hibernate.relation.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {

	public static void main(String[] args) {

		/*
		 * SessionFactory factory = new
		 * Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 * 
		 * // creating question // create 1st object Question que1 = new Question();
		 * que1.setQuestionId(1); que1.setQuestion("What is Java ?");
		 * 
		 * // creating object of answer Answer ans1 = new Answer(01,
		 * "Java is programming language.", que1); que1.setAnswer(ans1);
		 * 
		 * // 2nd que Question que2 = new Question(); que2.setQuestionId(2);
		 * que2.setQuestion("What is collection framework ?");
		 * 
		 * // creating object of answer Answer ans2 = new Answer(02,
		 * "API to work with object in java.", que2); que2.setAnswer(ans2);
		 * 
		 * // session Session session = factory.openSession(); Transaction tx =
		 * session.beginTransaction();
		 * 
		 * // save session.save(que1); session.save(que2); session.save(ans1);
		 * session.save(ans2); tx.commit();
		 * 
		 * //fetch data Question question = session.get(Question.class, 1);
		 * System.out.println(question);
		 * 
		 * session.close(); factory.close();
		 */
	}

}
