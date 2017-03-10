/**
 * 这是客户端连接服务器的后台
 */
package com.qq.client.model;
import java.net.*;
import java.io.*;
import java.util.*;

import com.qq.client.tools.ClientConServerThread;
import com.qq.client.tools.ManageConServerThread;
import com.qq.common.Message;
import com.qq.common.User;

public class QqClientConServer {
/**
 * 在这里socket不能是静态的  否则在开多个窗口进行聊天或者多个用户进行聊天会导致争夺s资源  产生流并发异常
 */
	//public static Socket  s;
	public Socket  s;
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
				//这里就是验证用户登录的地方
				if(ms.getMesType().equals("1"))
				{
					//创建一个该QQ和服务器端保持通讯连接的线程
					ClientConServerThread cost =new ClientConServerThread(s);
					//启动该通讯线程、
					cost.start();
					
					ManageConServerThread.addClientConServerThread(((User)o).getUserId(), cost);
					logincheck=true;	
				}else{
					//关闭socket
					s.close();
					
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
