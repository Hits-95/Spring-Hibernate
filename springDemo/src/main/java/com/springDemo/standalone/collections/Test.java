package com.springDemo.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/standalone/collections/data_confg.xml");
		Person person = context.getBean("person1", Person.class);
		
		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("----- fees Structure ------");
		System.out.println(person.getFees());
		System.out.println(person.getFees().getClass().getName());
		System.out.println("----- Popertices Structure ------");
		System.out.println(person.getProps());
		System.out.println(person.getProps().getClass().getName());
		
	}

}
