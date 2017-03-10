package com.qq.client.model;

import com.qq.common.User;
/**
 * 涉及到用户逻辑的都走这个类
 *
 */
public class QqClientUser {

	/**
	 * 登录验证
	 * @param u
	 * @return
	 */
	public boolean checkUser(User u){

		
		return new QqClientConServer().sendLoginInfoServer(u);
	}
}
