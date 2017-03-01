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
	 * 根据用户名查找用户
	 * @param username 用户名
	 * @return 根据用户名找到的用户信息bean,如果没找到返回null
	 */
	public User findUserByUserName (String username){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//在xml中查找具有username属性值等于传入的用户名的元素
		List<Element> list = root.selectNodes("//user[@username='"+username+"']");
		if(list.size()>0){//大于0说明找到了这个用户
			Element userEle = list.get(0);
			//将找到的用户信息封装到bean后返回
			User user = new User();
			user.setUsername(userEle.attributeValue("username"));
			user.setPassword(userEle.attributeValue("password"));
			user.setNickname(userEle.attributeValue("nickname"));
			user.setEmail(userEle.attributeValue("email"));
			user.setQuestion(userEle.attributeValue("question"));
			user.setAnswer(userEle.attributeValue("answer"));
			return user;
		}else{//说明没有找到这个用户
			return null;
		}
	}
	
	
	/**
	 * 添加用户
	 * @param user 要添加的用户信息bean
	 */
	public void addUser(User user){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//凭空创建出一个<user>元素,根据传入的user信息,设置此元素的属性
		Element userEle = DocumentHelper.createElement("user");
		userEle.setAttributeValue("username", user.getUsername());
		userEle.setAttributeValue("password", user.getPassword());
		userEle.setAttributeValue("nickname", user.getNickname());
		userEle.setAttributeValue("email", user.getEmail());
		userEle.setAttributeValue("question", user.getQuestion());
		userEle.setAttributeValue("answer", user.getAnswer());
		userEle.setAttributeValue("jihao","1");
		//挂载到<users>元素上
		root.add(userEle);
		//回写到xml文件中
		XmlDaoUtils.refXml();
	}
	
	/**
	 * 根据用户名密码查找对应的用户
	 * @param username 用户名
	 * @param password 密码
	 * @return 找到的用户,如果找不到则返回null
	 */
	public User findUserByUNandPSW(String username,String password){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//在xml中查找具有username属性值等于传入的用户名 并且 password 等于传入密码的元素
		List<Element> list = root.selectNodes("//user[@username='"+username+"' and @password='"+password+"']");
		if(list.size()>0){//大于0说明找到了这个用户
			Element userEle = list.get(0);
			//将找到的用户信息封装到bean后返回
			User user = new User();
			user.setUsername(userEle.attributeValue("username"));
			user.setPassword(userEle.attributeValue("password"));
			user.setNickname(userEle.attributeValue("nickname"));
			user.setEmail(userEle.attributeValue("email"));
			user.setQuestion(userEle.attributeValue("question"));
			user.setAnswer(userEle.attributeValue("answer"));
			return user;
		}else{//说明没有找到这个用户
			return null;
		}
	}
	/**
	 * 返回所有的问题的list集合
	 */
	public List<Question> getAllQuestions(int flag){
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//在xml中查找具有username属性值等于传入的用户名 并且 password 等于传入密码的元素
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
	 * 根据名字删除xml中的对应用户节点
	 * @param username
	 */
	public void deleteUser(String username) {
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//在xml中查找具有username属性值等于传入的用户名的元素
		List<Element> list = root.selectNodes("//user[@username='"+username+"']");
		if(list.size()>0){//大于0说明找到了这个用户
			Element userEle = list.get(0);
			//将找到的用户信息封装到bean后返回
			userEle.getParent().remove(userEle);
			XmlDaoUtils.refXml();
		}
	}
	
	public String getUserList() {
		
		Document dom = XmlDaoUtils.getDom();
		Element root = dom.getRootElement();
		//在xml中查找具有username属性值等于传入的用户名的元素
		List<Element> list = root.selectNodes("//user[@username]");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i).getName());
		}
		return null;
	
	}
}
