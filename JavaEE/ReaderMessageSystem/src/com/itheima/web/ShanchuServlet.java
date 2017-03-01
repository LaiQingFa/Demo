package com.itheima.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;

import com.itheima.dao.XmlUserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.util.XmlDaoUtils;

public class ShanchuServlet extends HttpServlet {
	

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			UserService service = new UserService();
			

			String username = request.getParameter("username");
			
			Document dom = XmlDaoUtils.getDom();
			Element root = dom.getRootElement();

			XmlUserDao xmldao=new XmlUserDao();
			xmldao.deleteUser(username);

			request.getRequestDispatcher("ShowChengyuanList").forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}


}
