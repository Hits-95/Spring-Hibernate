package com.springDemo.Constructor_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/Constructor_Injection/data_confg.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		System.out.println("------- Addition --------");
		Addition add = (Addition) context.getBean("add");
		add.doSum();

	}

}