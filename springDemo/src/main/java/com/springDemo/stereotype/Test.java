package com.springDemo.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/stereotype/data_confg.xml");
		Student student = context.getBean("temp", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println("_________ hash code ____________");
		//using @annotation
		Student student1 = context.getBean("temp", Student.class);
		System.out.println("student  : " + student.hashCode());
		System.out.println("student1 : " + student1.hashCode());
		
		//using xml
		Tea tea1 = context.getBean("tea", Tea.class);
		Tea tea2 = context.getBean("tea", Tea.class);
		System.out.println("Tea1 : "+tea1.hashCode());
		System.out.println("Tea2 : "+tea2.hashCode());
	}

}
