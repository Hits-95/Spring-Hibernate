package com.springDemo.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/reference/Data_congf.xml");
		
		A A_obj = (A) context.getBean("A_ref");
		
		System.out.println(A_obj.getX());
		System.out.println(A_obj.getObj().getY());
		System.out.println("object A : " + A_obj);
		System.out.println("object B :  " + A_obj.getObj());

	}
}
