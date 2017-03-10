package com.qq.client.tools;

import java.util.HashMap;

import com.qq.client.view.QqChat;

/**
 * 这是管理用户聊天界面的类
 * @author Administrator
 *
 */
public class ManageQqChat {

	//String 表示 唯一标识两个用户聊天 的key
	private static HashMap hm=new HashMap<String,QqChat>();
	
	/**
	 * 加入
	 */
	public static void addQqChat(String LoginIdAnFriendId,QqChat qq)
	{
		hm.put(LoginIdAnFriendId, qq);
		
	}
	
	/**
	 * 取出
	 */
	public static QqChat getQqChat(String LoginIdAnFriendId)
	{
		return (QqChat) hm.get(LoginIdAnFriendId);
		
	}
	
	
}
