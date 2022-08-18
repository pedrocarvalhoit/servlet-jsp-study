package com.duarte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RunningTimeServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name = req.getParameter("name");
		int km = Integer.parseInt(req.getParameter("km"));
		int timeRun = Integer.parseInt(req.getParameter("timeRun"));
		PrintWriter out = res.getWriter();
		
		out.println("Hello " + name);
		out.println("---------------------");
		
		if(km == 24) {
			out.println("If you wann run a good Half Marathon You need to train 20 km per week ");
		}else if(km == 42){
			out.println("If you wann run a good Marathon You need to train 48 km per week ");
		}else{
			out.println("Try againg with the correct awnser");
		}
		
		out.println("---------------------");

		if(timeRun <= 130) {
			out.println("You need to run 50 km per week if you want to go under 2 hours");
		}else if(timeRun >=130){
			out.println("You can train 42 km per week for over 2 hours");
		}else{
			out.println("Try againg with the correct awnser");
		}
		
		out.println("---------------------");
		
		out.println("Have a nice train");

		
	}

}
