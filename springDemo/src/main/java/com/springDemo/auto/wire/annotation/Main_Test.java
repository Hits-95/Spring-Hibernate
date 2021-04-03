
package com.springDemo.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/auto/wire/annotation/auto_confg.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
	}

}
