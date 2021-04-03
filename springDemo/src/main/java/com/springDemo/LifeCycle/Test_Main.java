package com.springDemo.LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/LifeCycle/data_confg.xml");
		Samosa samosa1 = (Samosa) context.getBean("samosa1");
		System.out.println(samosa1);
		
		//registring shut down hook
		context.registerShutdownHook();
		System.out.println("++++++++++++++");
		Pepsi pepsi1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(pepsi1);
		System.out.println("++++++++++++++");
		Example exam = (Example) context.getBean("exam");
		System.out.println(exam);
	}

}
