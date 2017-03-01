package com.itheima.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.service.UserService;

public class TurnToPersonServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		UserService service = new UserService();
		String name = request.getParameter("name");
		User user=new User();
		user=service.getUserByName(name);
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("/person.jsp").forward(request, response);
}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	        doGet(request,response);
}
	}