package com.springDemo.removeXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springDemo.removeXML") // its optional while get obj using method getStudent() but
															// must in without method
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {

		// return samosa object
		return new Samosa();
	}

	@Bean
	public Student getStudent() {

		// return Student object to use
		return new Student(getSamosa());
	}
}
