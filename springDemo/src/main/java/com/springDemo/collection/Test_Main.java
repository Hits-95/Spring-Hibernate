package com.springDemo.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/collection/data_confg.xml");
		Employee emp1 = (Employee) context.getBean("Emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddr());
		System.out.println(emp1.getCourse());
		System.out.println(emp1.getProp());
	}
}
