package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entites.Student;


@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired //set value here or in setJdbcTemplate() method
	private JdbcTemplate jdbcTemplate;
	
	private String query;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// mysql oprations...
	// insert query...
	public int insert(Student student) {

		query = "INSERT INTO `student` (`id`, `name`, `city`) VALUES (?,?,?)";
		return this.jdbcTemplate.update(query, student.getId(), student.getNaem(), student.getCity());
	}

	// update query
	public int update(Student student) {

		query = "UPDATE student SET name = ?, city = ? WHERE id = ?";
		return this.jdbcTemplate.update(query, student.getNaem(), student.getCity(), student.getId());
	}

	// delete opration...
	public int delete(int studentId) {

		query = "DELETE FROM student WHERE id = ?";
		return this.jdbcTemplate.update(query, studentId);
	}

	// select oprationsc
	// get single student data
	public Student getStudent(int studentId) {

		query = "SELECT * FROM student WHERE id = ?";

		// usding creating new RowMapperImpl() implementation class
		// RowMapper<Student> rowMapper = new RowMapperImpl();
		// return this.jdbcTemplate.queryForObject(query, rowMapper, studentId);

		// without creating new RowMapperImpl() class using annonimus class
		return this.jdbcTemplate.queryForObject(query, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student student = new Student();

				student.setId(rs.getInt(1));
				student.setNaem(rs.getString(2));
				student.setCity(rs.getString(3));
				
				System.out.println(rowNum);
				return student;
			}
		}, studentId);
	}

	//get all students data 
	public List<Student> getAllStudents() {
		
		query = "SELECT * FROM student";
		return this.jdbcTemplate.query(query, new RowMapperImpl());
	}

}
