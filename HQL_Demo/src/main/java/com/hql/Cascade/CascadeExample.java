package com.hql.Cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hql.entity.Answer;
import com.hql.entity.Question;

public class CascadeExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Question que = new Question();
		que.setQuestionId(4);
		que.setQuestion("What is  framere cascading....");
		
		Answer ans1 = new Answer(7, "In hivernate it is imp concept", que);
		Answer ans2 = new Answer(8, "Somethis id new in that", que);
		Answer ans3 = new Answer(9, "Lets start to learn.", que);
		
		List<Answer> list = new ArrayList<Answer>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		que.setAnswers(list);
		
		Transaction tx = session.beginTransaction();
		session.save(que);
		//you dont neet to save it use cascade in question entity
		
//		session.save(ans1);
//		session.save(ans2);
//		session.save(ans3);
		tx.commit();
		
				
		session.close();
		factory.close();
	}

}
