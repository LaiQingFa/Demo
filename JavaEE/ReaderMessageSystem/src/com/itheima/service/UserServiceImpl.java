package com.itheima.service;

import java.util.List;

import com.itheima.domain.Question;
import com.itheima.domain.User;
import com.itheima.exception.MsgException;

public interface UserServiceImpl {
	public void registUser(User user) throws MsgException;
	public User isUser(String username,String password);
	public User getUserByName(String username);
	public List<Question> getAllQuestions();
}
