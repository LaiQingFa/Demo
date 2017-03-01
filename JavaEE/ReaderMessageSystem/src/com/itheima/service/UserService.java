package com.itheima.service;

import java.util.List;

import com.itheima.dao.XmlUserDao;
import com.itheima.domain.Question;
import com.itheima.domain.User;
import com.itheima.exception.MsgException;

public class UserService implements UserServiceImpl{
	private XmlUserDao dao = new XmlUserDao();
	/**
	 * 添加用户
	 * @param user
	 * @throws MsgException 
	 */
	public void registUser(User user) throws MsgException{
		//1.检查用户名是否已经存在,如果已经存在则提示
		if(dao.findUserByUserName(user.getUsername())!=null){
			throw new MsgException("用户名已经存在!");
		}
		//2.如果不存在则调用dao中的方法添加用户
		dao.addUser(user);
	}
	
	/**
	 * 检查用户名密码是否正确
	 * @param username
	 * @param password
	 */
	public User isUser(String username,String password){
		return dao.findUserByUNandPSW(username, password);
	}
	/**
	 * 用于找回密码，根据姓名返回用户实体
	 * @param username姓名
	 * @return
	 */
	public User getUserByName(String username){
		return dao.findUserByUserName(username);
	}
	/**
	 * 得到所有的问题list
	 * @return
	 */
	public List<Question> getAllQuestions(){
		return dao.getAllQuestions(0);
	}
}
