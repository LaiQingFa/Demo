/**
 * 这是客户端连接服务器的后台
 */
package com.qq.client.model;
import java.net.*;
import java.io.*;
import java.util.*;

import com.qq.common.Message;
import com.qq.common.User;

public class QqClientConServer {

	public static Socket  s;
	
	public QqClientConServer()
	{
		
		
	}
	/**
	 * 发送第一次请求
	 * 登录请求
	 */
	public boolean sendLoginInfoServer(Object o)
	{
		boolean logincheck=false;
		try {
			System.out.println("+++++++++");
			s =new Socket ("127.0.0.1",9999);
			ObjectOutputStream oos =new ObjectOutputStream(s.getOutputStream());
			oos.writeObject(o);
			
			ObjectInputStream osi=new ObjectInputStream(s.getInputStream());
			
			try {
				Message ms=(Message)osi.readObject();
				if(ms.getMesType().equals("1"))
				{
					logincheck=true;	
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return logincheck;
		
	 }
	
	
	public void sendInfoToServer(){
	
		
	}
	
	
}
