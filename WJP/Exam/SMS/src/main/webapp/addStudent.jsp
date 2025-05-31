<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addStudent" method="post">
    ID: <input type="number" name="id" required><br/>
    RollNo: <input type="text" name="rollno" required><br/>   
    Name: <input type="text" name="name" required><br/>
   	Email: <input type="text" name="email" required><br/>
    Course: <input type="text" name="course" required><br/>
    Grade: <input type="text" name="grade" required><br/>
    <input type="submit" value="Add Student">
</form>
</body>
</html>