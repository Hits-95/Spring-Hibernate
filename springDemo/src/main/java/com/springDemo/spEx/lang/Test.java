package com.springDemo.spEx.lang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/spEx/lang/data_Confg.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.print(demo);
	}

}
