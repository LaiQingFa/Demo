package com.qq.server.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.qq.common.Message;

/**
 * 
 *功能：是服务器和某个客户端的通信线程
 *
 */
public class ServerClientThread extends Thread{

	Socket s;
	
	public ServerClientThread(Socket s)
	{
		//把服务器与该客户端的连接 赋给s
		this.s=s;
		
	}
	
	
	public void run()
	{
		while(true)
		{
			//这里该线程就可以接受客户端的信息
			try {
				ObjectInputStream osi=new ObjectInputStream(s.getInputStream());
				System.out.println("线程就可以接受客户端的信息");
				
				try {
					Message m=(Message) osi.readObject();
					
					System.out.println(m.getSender()+"给"+m.getGetter()+"说"+m.getCon());
					
					//一会完成转发
					//取得接收人的通信线程 将信息转发
					ServerClientThread sc =ManageClientThread.getClientThread(m.getGetter());
					ObjectOutputStream oos=new ObjectOutputStream(sc.s.getOutputStream());
					oos.writeObject(m);
					
					
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
	
}
