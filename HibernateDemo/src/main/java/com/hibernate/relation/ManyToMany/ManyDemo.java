package com.hibernate.relation.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyDemo {
	public static void main(String[] argv) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Create Employee
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		emp1.setEid(1);
		emp1.setName("Hitesh Ahire");

		emp2.setEid(2);
		emp2.setName("Pradhunya Shewale");

		// create project
		Project pro1 = new Project();
		Project pro2 = new Project();

		pro1.setPid(1);
		pro1.setProjectName("Library Managment System");
		
		pro2.setPid(2);
		pro2.setProjectName("Student Managment System");
		
		//create list of employess and projects;
		List<Employee> listEmp = new ArrayList<Employee>();
		List<Project> listPro = new ArrayList<Project>();
		
		listEmp.add(emp1);
		listEmp.add(emp2);
		
		listPro.add(pro1);
		listPro.add(pro2);
		
		//assine list of project ot emp1
		emp1.setProjects(listPro);
		
		//assine project2 working two emp
		pro2.setEmployees(listEmp);
		
		//save
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(emp1);
		session.save(emp2);
		session.save(pro1);
		session.save(pro2);
		tx.commit();
		
		session.clear();
		factory.close();
	}
}
