/**
 * 我的好友列表
 */

package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.qq.client.tools.ManageQqChat;

public class QqFriendList extends JFrame implements ActionListener,MouseListener{

	//处理第一张卡片
	
	JPanel jphy1,jphy2,jphy3;
	JButton jphy1_jb1,jphy1_jb2,jphy1_jb3;
	JScrollPane jsp1;
	
	String owner;
	//处理第二张卡片
	
	JPanel jpmsr1,jpmsr2,jpmsr3;
	JButton jpmsr_jb1,jpmsr_jb2,jpmsr_jb3;
	JScrollPane jsp2;
	
	//把整个JFrame设置成CardLayout
	CardLayout cl ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QqFriendList qf=new QqFriendList();
	}

	public QqFriendList(String ownerId)
	{
		this.owner=ownerId;
		//处理第一张卡片(显示好友列表)
		jphy1_jb1=new JButton("我的好友");
		jphy1_jb2=new JButton("陌生人");
		jphy1_jb2.addActionListener(this);
		
		jphy1_jb3=new JButton("黑名单");
		jphy1=new JPanel(new BorderLayout());
		//假定有50个好友
		jphy2=new JPanel(new GridLayout(50,1,4,4));		
		//给jphy2初始化50个好友
		JLabel []jbls =new JLabel[50];
		for(int i=0;i<jbls.length;i++){
			jbls[i]=new JLabel(i+1+"",new ImageIcon("image/boy.png"),JLabel.LEFT);
			jbls[i].addMouseListener(this);
			jphy2.add(jbls[i]);
		}	
		jphy3=new JPanel(new GridLayout(2,1));
		//把两个按钮加入到jphy3
		jphy3.add(jphy1_jb2);
		jphy3.add(jphy1_jb3);	
		
		jsp1=new JScrollPane(jphy2);
		
		//对jphy1初始化
		jphy1.add(jphy1_jb1,"North");
		jphy1.add(jsp1,"Center");
		jphy1.add(jphy3,"South");
		
		
		//处理第二张卡片(显示陌生人列表)
		jpmsr_jb1=new JButton("我的好友");
		jpmsr_jb1.addActionListener(this);
		jpmsr_jb2=new JButton("陌生人");
		jpmsr_jb3=new JButton("黑名单");
		jpmsr1=new JPanel(new BorderLayout());
		//假定有20个陌生人
		jpmsr2=new JPanel(new GridLayout(20,1,4,4));		
		//给jpmsr2初始化20个陌生人
		JLabel []jbls2 =new JLabel[20];
		for(int i=0;i<jbls2.length;i++){
			jbls2[i]=new JLabel(i+1+"",new ImageIcon("image/boy.png"),JLabel.LEFT);
			jpmsr2.add(jbls2[i]);
		}	
		jpmsr3=new JPanel(new GridLayout(2,1));
		//把两个按钮加入到jpmsr3
		jpmsr3.add(jpmsr_jb1);
		jpmsr3.add(jpmsr_jb2);	
		
		jsp2=new JScrollPane(jpmsr2);
	
		//对jpmsr1初始化
		jpmsr1.add(jpmsr3,"North");
		jpmsr1.add(jsp2,"Center");
		jpmsr1.add(jpmsr_jb3,"South");
		
		cl=new CardLayout();
		this.setLayout(cl);
		this.add(jphy1,"1");
		this.add(jpmsr1,"2");
		//在窗口显示自己的编号
		
		this.setSize(216,454);
		this.setVisible(true);
		//窗口在屏幕中间显示
		this.setLocationRelativeTo(null);
		this.setIconImage((new ImageIcon("image/qq.png")).getImage());
		this.setTitle(ownerId+"的聊天列表");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jphy1_jb2)
		{
			cl.show(this.getContentPane(), "2");				
		}else if(e.getSource()==jpmsr_jb1)
		{
			cl.show(this.getContentPane(), "1");				
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//响应用户双击的时间，并得到好友的编号
		//双击鼠标 
		if(e.getClickCount()==2)
		{
			//得到该好友的编号
			String friendNum=((JLabel) e.getSource()).getText();
		System.out.println("你希望和"+friendNum+"聊天天");
		
		QqChat qc=new QqChat(this.owner,friendNum);
//		Thread t=new Thread(qc);
//		t.start();

		//把聊天界面加入到管理类中
		ManageQqChat.addQqChat(this.owner+" "+friendNum, qc);
		
		
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jl=(JLabel) e.getSource();
		jl.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JLabel jl=(JLabel) e.getSource();
		jl.setForeground(Color.black);
		
	}

	
	
	
}
