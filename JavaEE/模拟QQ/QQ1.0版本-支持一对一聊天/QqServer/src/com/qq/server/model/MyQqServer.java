package com.qq.server.model;
/**
 * 这是QQ服务器，他在监听，等待某个QQ客户端，来连接
 *
在网络中传输对象流
 *
 */
import java.net.*;
import java.io.*;
import java.util.*;

import com.qq.common.Message;
import com.qq.common.User;
public class MyQqServer {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public MyQqServer()
	{
		try {
			//监听本地9999端口
			System.out.println("我是服务器，在9999端口监听");
			ServerSocket ss=new ServerSocket(9999);
			
			
			
		    //阻塞，等待连接、   循环的监听
			while(true)
			{
			Socket s=ss.accept();
			System.out.println("接受客户端发来的信息");
			
			
			//接受客户端发来的信息
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			try {
				User u=(User)ois.readObject();
				System.out.println("服务器接收到用户账号和密码"+u.getUserId()+"  "+u.getPasswd());
				
				Message ms=new Message();
				ObjectOutputStream oos =new ObjectOutputStream(s.getOutputStream());
				
				if(u.getPasswd().equals("123456"))
				{
					//返回一个成功登录的信息包

					ms.setMesType("1");
					oos.writeObject(ms);
					
					//这里就单开一个线程，让该线程与该客户端保持通讯,不同用户登录的socket不同
					ServerClientThread scct =new ServerClientThread(s);
					ManageClientThread.addClientThread(u.getUserId(), scct);
					
					//启动与该客户端通信的线程
					scct.start();
					
					
					
				}else{
					
					ms.setMesType("2");
					oos.writeObject(ms);
					//关闭连接
					s.close();
				}
				
				
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}	
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
