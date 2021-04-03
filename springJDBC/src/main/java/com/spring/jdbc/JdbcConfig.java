package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

@Configuration
@ComponentScan(basePackages = "com.spring.jdbc.dao") //using autowire do not neet to write methode
public class JdbcConfig {

	// make connection with database
	@Bean("conn")
	public DataSource getDataSourse() {
		DriverManagerDataSource conn = new DriverManagerDataSource();
		conn.setDriverClassName("com.mysql.jdbc.Driver");
		conn.setUrl("jdbc:mysql://127.0.0.1:3306/springjdbc");
		conn.setUsername("Hitesh");
		conn.setPassword("online");
		return conn;
	}

	// get JdbcTemplate object for perform oprations
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSourse());
		return jdbcTemplate;
	}

	// get connection for studentDao class
	/*
	 * @Bean(name = { "studentDao" }) public StudentDao getStudentDao() {
	 * 
	 * StudentDaoImpl studentDao = new StudentDaoImpl();
	 * studentDao.setJdbcTemplate(getTemplate()); return studentDao; }
	 */

	// make onject of student for send data;
	@Bean("student1")
	public Student getStudent() {
		Student student = new Student();
		student.setId(7);
		student.setNaem("Shubham Jagtap");
		student.setCity("At Dabli Malegain Nashik");
		return student;
	}
}
