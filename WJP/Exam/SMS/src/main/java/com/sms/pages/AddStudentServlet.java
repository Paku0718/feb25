package com.sms.pages;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/addStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = new Student();
		s.setId(Integer.parseInt(req.getParameter("id")));
		s.setRollNo(req.getParameter("rollno"));
		s.setName(req.getParameter("name"));
		s.setEmail(req.getParameter("email"));
		s.setCourse(req.getParameter("course"));
		s.setGrade(req.getParameter("grade"));
		
		StudentDAO dao = new StudentDAO();
		dao.insertStudent(s);
		resp.sendRedirect("listStudent.jsp");
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
