package com.itheima.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;

import com.itheima.dao.XmlUserDao;
import com.itheima.domain.User;
import com.itheima.exception.MsgException;
import com.itheima.service.UserService;
import com.itheima.util.XmlDaoUtils;

public class ShowChengyuanList extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			UserService service = new UserService();
			
			Document dom = XmlDaoUtils.getDom();
			Element root = dom.getRootElement();
			//在xml中查找具有username属性值等于传入的用户名的元素
			List<Element> list = root.selectNodes("//user[@jihao='"+1+"']");
	
			if(list.size()>0){//大于0说明找到了这个用户
				
				List<User> listuser =new ArrayList(list.size());
				
				for(int i=0;i<4;i++){
					
//					listuser.get(i).setUsername(list.get(i).attributeValue("username"));
//					listuser.get(i).setNickname(list.get(i).attributeValue("nickname"));
					
					String user1username=list.get(0).attributeValue("username");
					String user1nickname=list.get(0).attributeValue("nickname");
					String user2username=list.get(1).attributeValue("username");
					String user2nickname=list.get(1).attributeValue("nickname");
					String user3username=list.get(2).attributeValue("username");
					String user3nickname=list.get(2).attributeValue("nickname");
					String user4username=list.get(3).attributeValue("username");
					String user4nickname=list.get(3).attributeValue("nickname");
					
					request.getSession().setAttribute("user1username", user1username);
					request.getSession().setAttribute("user1nickname", user1nickname);
					request.getSession().setAttribute("user2username", user2username);
					request.getSession().setAttribute("user2nickname", user2nickname);
					request.getSession().setAttribute("user3username", user3username);
					request.getSession().setAttribute("user3nickname", user3nickname);
					request.getSession().setAttribute("user4username", user4username);
					request.getSession().setAttribute("user4nickname", user4nickname);
					
					
				}

		
			}

			response.setHeader("refresh", "0;url="+request.getContextPath()+"/show.jsp");
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
