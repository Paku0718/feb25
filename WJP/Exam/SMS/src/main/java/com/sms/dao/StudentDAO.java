package com.sms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sms.model.Student;

public class StudentDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/student_db";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	}
	
	public boolean insertStudent(Student s) {
		String sql = "insert into student values(?,?,?,?,?,?)";
		try(Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql)){
			ps.setInt(1, s.getId());
			ps.setString(2, s.getRollNo());
			ps.setString(3, s.getName());
			ps.setString(4, s.getEmail());
			ps.setString(5, s.getCourse());
			ps.setString(6, s.getGrade());
			
			return ps.executeUpdate()>0;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Student>getAllStudent(){
		List<Student>list = new ArrayList<>();
		String sql = "select * from student";
		
		try(Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery()){
			
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setRollNo(rs.getString("rollno"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setCourse(rs.getString("course"));
				s.setGrade(rs.getString("grade"));
				list.add(s);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
}
