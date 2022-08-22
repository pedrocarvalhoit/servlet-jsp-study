package com.duarte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/demoservlet")
public class DemoServletJSTL extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//JSTL -> JSP Standart Tag Library 
		
		Student student1 = new Student(1, "Victor Duarte");
		request.setAttribute("student1", student1.getName());
		
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(student1);
		listStudents.add(new Student(2, "Thamires"));
		listStudents.add(new Student(3, "Luisa"));
		request.setAttribute("students", listStudents);
		
		String name = "Pedro Duarte";
		request.setAttribute("label", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("demoJSTL.jsp");
		rd.forward(request, response);
		
	}

}
