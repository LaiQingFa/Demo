package com.qq.client.tools;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

import com.qq.client.view.QqChat;
import com.qq.common.Message;

/*
 * 这是客户端和服务器端保持通讯的线程
 * 只要一个账号登录就开一个线程，让这个账号和服务器保持通讯
 */
public class ClientConServerThread extends Thread{

	private Socket s;
	
	//构造函数
	public ClientConServerThread(Socket s)
	{
		
		this.s=s;
		
	}
	
	
	public void run()
	{
		while(true)
		{
			//不停的读取从服务器端发来的消息
			try {
				ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			try {
				Message m=(Message) ois.readObject();
				
				System.out.println("读取从服务器发送过来的消息"+m.getSender()+"给"+m.getGetter()+"说"+m.getCon());
				
				String LoginIdAnFriendId=m.getGetter()+" "+m.getSender();
				//把从服务器获得的消息显示到   对应的聊天界面
				QqChat qqChat =ManageQqChat.getQqChat(LoginIdAnFriendId);
				//显示
				qqChat.showMessage(m);
				
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


	public Socket getS() {
		return s;
	}


	public void setS(Socket s) {
		this.s = s;
	}
}
