<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.*, com.sms.dao.StudentDAO, com.sms.model.Student" %>
<a href="addStudent.jsp">Add Student</a>
<table border ="2">
	<tr>
		<th>ID</th><th>Roll No</th><th>Name</th><th>Email</th><th>Course</th><th>Grade</th><th>Actions</th>
	</tr>
	<%
		List<Student> list = new StudentDAO().getAllStudent();
		for (Student s: list){
	%>
	<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getRollNo() %></td>
		<td><%=s.getName() %></td>
		<td><%=s.getEmail() %></td>
		<td><%=s.getCourse() %></td>
		<td><%=s.getGrade() %></td>
		<td>
			<a href="">Edit</a>
			<a href="">Delete</a>
		</td>
	</tr>
	<% } %>
</table>
</body>
</html>