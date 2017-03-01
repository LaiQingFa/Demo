package com.itheima.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.itheima.domain.Question;
import com.itheima.domain.User;
import com.itheima.util.XmlDaoUtils;

public class XmlUserDao  implements XmlUserDaoImpl{
	/**
	 * �����û��������û�
	 * @param username �û���
	 * @return �����û����ҵ����û���Ϣbean,���û�ҵ�����null
	 */
	public User findUserByUserName (String username){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//��xml�в��Ҿ���username����ֵ���ڴ�����û�����Ԫ��
		List<Element> list = root.selectNodes("//user[@username='"+username+"']");
		if(list.size()>0){//����0˵���ҵ�������û�
			Element userEle = list.get(0);
			//���ҵ����û���Ϣ��װ��bean�󷵻�
			User user = new User();
			user.setUsername(userEle.attributeValue("username"));
			user.setPassword(userEle.attributeValue("password"));
			user.setNickname(userEle.attributeValue("nickname"));
			user.setEmail(userEle.attributeValue("email"));
			user.setQuestion(userEle.attributeValue("question"));
			user.setAnswer(userEle.attributeValue("answer"));
			return user;
		}else{//˵��û���ҵ�����û�
			return null;
		}
	}
	
	
	/**
	 * ����û�
	 * @param user Ҫ��ӵ��û���Ϣbean
	 */
	public void addUser(User user){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//ƾ�մ�����һ��<user>Ԫ��,���ݴ����user��Ϣ,���ô�Ԫ�ص�����
		Element userEle = DocumentHelper.createElement("user");
		userEle.setAttributeValue("username", user.getUsername());
		userEle.setAttributeValue("password", user.getPassword());
		userEle.setAttributeValue("nickname", user.getNickname());
		userEle.setAttributeValue("email", user.getEmail());
		userEle.setAttributeValue("question", user.getQuestion());
		userEle.setAttributeValue("answer", user.getAnswer());
		userEle.setAttributeValue("jihao","1");
		//���ص�<users>Ԫ����
		root.add(userEle);
		//��д��xml�ļ���
		XmlDaoUtils.refXml();
	}
	
	/**
	 * �����û���������Ҷ�Ӧ���û�
	 * @param username �û���
	 * @param password ����
	 * @return �ҵ����û�,����Ҳ����򷵻�null
	 */
	public User findUserByUNandPSW(String username,String password){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//��xml�в��Ҿ���username����ֵ���ڴ�����û��� ���� password ���ڴ��������Ԫ��
		List<Element> list = root.selectNodes("//user[@username='"+username+"' and @password='"+password+"']");
		if(list.size()>0){//����0˵���ҵ�������û�
			Element userEle = list.get(0);
			//���ҵ����û���Ϣ��װ��bean�󷵻�
			User user = new User();
			user.setUsername(userEle.attributeValue("username"));
			user.setPassword(userEle.attributeValue("password"));
			user.setNickname(userEle.attributeValue("nickname"));
			user.setEmail(userEle.attributeValue("email"));
			user.setQuestion(userEle.attributeValue("question"));
			user.setAnswer(userEle.attributeValue("answer"));
			return user;
		}else{//˵��û���ҵ�����û�
			return null;
		}
	}
	/**
	 * �������е������list����
	 */
	public List<Question> getAllQuestions(int flag){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//��xml�в��Ҿ���username����ֵ���ڴ�����û��� ���� password ���ڴ��������Ԫ��
		List<Element> list = root.selectNodes("//question[@flag='"+flag+"']");
		List<Question> questionList=new ArrayList<Question>();
		for(int i=0;i<list.size();i++){
			Element userEle = list.get(i);
			Question question=new Question();
			question.setName(userEle.attributeValue("name"));
			questionList.add(question);
		}
		return questionList;
	}
	
	/**
	 * ��������ɾ��xml�еĶ�Ӧ�û��ڵ�
	 * @param username
	 */
	public void deleteUser(String username) {
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//��xml�в��Ҿ���username����ֵ���ڴ�����û�����Ԫ��
		List<Element> list = root.selectNodes("//user[@username='"+username+"']");
		if(list.size()>0){//����0˵���ҵ�������û�
			Element userEle = list.get(0);
			//���ҵ����û���Ϣ��װ��bean�󷵻�
			userEle.getParent().remove(userEle);
			XmlDaoUtils.refXml();
		}
	}
	
	public String getUserList() {
		
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//��xml�в��Ҿ���username����ֵ���ڴ�����û�����Ԫ��
		List<Element> list = root.selectNodes("//user[@username]");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).getName());
		}
		return null;
	
	}
}
