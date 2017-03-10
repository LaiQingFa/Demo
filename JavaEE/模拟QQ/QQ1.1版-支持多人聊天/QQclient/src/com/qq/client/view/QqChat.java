/**
 * 这是和好友聊天的界面
 */
package com.qq.client.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.qq.client.model.QqClientConServer;
import com.qq.client.tools.ManageConServerThread;
import com.qq.common.Message;
/**
 * 因为客户端要处于读取的状态，因此我们把它做成一个线程
 *
 */
public class QqChat extends JFrame implements ActionListener{

	JTextArea jta;
	JTextField jtf;
	JButton jb;
	JPanel jp;
	String ownerId;
	String FriendId;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QqChat qc =new QqChat("1");
	}

	public  QqChat(String ownerId,String Friend){
        this.ownerId=ownerId;
        this.FriendId=Friend;
		jta=new JTextArea();
		jtf=new JTextField(15);
		jb=new JButton("发送");
		jb.addActionListener(this);
		jp=new JPanel();
		jp.add(jtf);
		jp.add(jb);
		
		this.add(jta,"Center");
		this.add(jp,"South");
		this.setIconImage((new ImageIcon("image/qq.png")).getImage());
		this.setTitle(ownerId+"正在和"+Friend +"聊天");
		this.setSize(300,200);
		this.setVisible(true);
		//窗口在屏幕中间显示
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb){
			//如果用户点击发送按钮
			Message m=new Message();
			m.setSender(this.ownerId);
			m.setGetter(this.FriendId);
			m.setCon(jtf.getText());
			m.setSendTime(new Date().toString());
			
			String mestime =m.getSendTime()+"\r\n";
			this.jta.append(mestime);
			String info=m.getSender()+" 对 "+m.getGetter()+" 说"+m.getCon()+"\r\n";
			this.jta.append(info);
			
			
			//发送给服务器
			try {
				ObjectOutputStream oos =new ObjectOutputStream(ManageConServerThread.getClientConServerThread(ownerId).getS().getOutputStream());
				oos.writeObject(m);
			System.out.println("发送了啦啦啦啦啦绿绿"+m.getGetter()+"+++"+m.getMesType());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
	}

	/*
	 * 写一个方法，让它显示消息
	 */
	public void showMessage(Message m)
	{
		String mestime =m.getSendTime()+"\r\n";
		this.jta.append(mestime);
		String info=m.getSender()+" 对 "+m.getGetter()+" 说"+m.getCon()+"\r\n";
		this.jta.append(info);
		
	}
	
//	@Override
//	public void run() {
//		//聊天界面一直处于读取的状态
//		while(true)
//		{
//			
//			try {
//				//读取   如果读不到  会保持等待
//				ObjectInputStream ois =new ObjectInputStream(QqClientConServer.s.getInputStream());
//				try {
//					Message m=(Message) ois.readObject();
//				
//				//显示
//					String mestime =m.getSendTime()+"\r\n";
//					this.jta.append(mestime);
//					String info=m.getSender()+" 对 "+m.getGetter()+" 说"+m.getCon()+"\r\n";
//					this.jta.append(info);
//				
//				} catch (ClassNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//	
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		}
//		
//	}
}
