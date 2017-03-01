package com.itheima.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Question;
import com.itheima.factory.BasicFactory;
import com.itheima.service.UserService;

public class firstTurnToBackServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserService service = new UserService();
		//1.调用Service中查询所有客户的方法,查找到所有客户
		List<Question> list = service.getAllQuestions();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/back.jsp").forward(request, response);
}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	        doGet(request,response);
	}
}
