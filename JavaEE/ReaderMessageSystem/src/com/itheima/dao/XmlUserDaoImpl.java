package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Question;
import com.itheima.domain.User;

public interface XmlUserDaoImpl {
	public User findUserByUserName(String username);
	public void addUser(User user);
	public User findUserByUNandPSW(String username,String password);
	public List<Question> getAllQuestions(int flag);
}
