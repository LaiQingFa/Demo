package com.qq.common;
/**
 * 这是用户信息类
 * 
 *序列化就是可以让一个对象在网络上或者在文件中传输
 */
public class User  implements java.io.Serializable{
	private String userId;
	private String passwd;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}



}
