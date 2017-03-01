package com.itheima.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.domain.User;
import com.itheima.service.UserService;

public class BackServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		UserService service = new UserService();
		String name = request.getParameter("name");
		User user=new User();
		User user1 = new User();
		try {
			BeanUtils.populate(user1, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		user=service.getUserByName(name);
		String answerString=user1.getAnswer();
		String questionString =user1.getQuestion();
		if(user.getAnswer().equals(answerString)&&user.getQuestion().equals(questionString)){
			request.getSession().setAttribute("user", user);
			
		}else if(!user.getQuestion().equals(questionString)){
			user.setPassword("密保问题错误");;
			user.setAnswer("密保问题错误");
			user.setEmail("密保问题错误");
			user.setNickname("密保问题错误");
			request.getSession().setAttribute("user", user);
		}else{
			user.setPassword("密保答案错误");;
			user.setAnswer("密保答案错误");
			user.setEmail("密保答案错误");
			user.setNickname("密保答案错误");
			request.getSession().setAttribute("user", user);
		}
		request.getRequestDispatcher("/person.jsp").forward(request, response);
}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	        doGet(request,response);
	}
}