package com.itheima.service;

import java.util.List;

import com.itheima.dao.XmlUserDao;
import com.itheima.domain.Question;
import com.itheima.domain.User;
import com.itheima.exception.MsgException;

public class UserService implements UserServiceImpl{
	private XmlUserDao dao = new XmlUserDao();
	/**
	 * ����û�
	 * @param user
	 * @throws MsgException 
	 */
	public void registUser(User user) throws MsgException{
		//1.����û����Ƿ��Ѿ�����,����Ѿ���������ʾ
		if(dao.findUserByUserName(user.getUsername())!=null){
			throw new MsgException("�û����Ѿ�����!");
		}
		//2.��������������dao�еķ�������û�
		dao.addUser(user);
	}
	
	/**
	 * ����û��������Ƿ���ȷ
	 * @param username
	 * @param password
	 */
	public User isUser(String username,String password){
		return dao.findUserByUNandPSW(username, password);
	}
	/**
	 * �����һ����룬�������������û�ʵ��
	 * @param username����
	 * @return
	 */
	public User getUserByName(String username){
		return dao.findUserByUserName(username);
	}
	/**
	 * �õ����е�����list
	 * @return
	 */
	public List<Question> getAllQuestions(){
		return dao.getAllQuestions(0);
	}
}
