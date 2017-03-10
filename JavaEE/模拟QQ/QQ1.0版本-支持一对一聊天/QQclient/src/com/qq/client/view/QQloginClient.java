/**
 * qq客户端登录
 */
package com.qq.client.view;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.net.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.qq.client.model.QqClientUser;
import com.qq.common.User;
public class QQloginClient extends JFrame implements ActionListener{
    
	//定义北部需要的组件
	JLabel jbl1=null;
	
	//定义中部需要的组件
	//中部有三个jpanel，有一个选项卡窗口管理
	JTabbedPane jtp;
	JPanel jp2,jp3,jp4;
	JLabel jp2_jbl1,jp2_jbl2,jp2_jbl3,jp2_jbl4;
	JButton jp2_jb1;
	JTextField jp2_jtf;
	JPasswordField jp2_jpf;
	JCheckBox jp2_jcb1,jp2_jcb2;
	
	//定义南部需要的组件
	JPanel jp1;
	JButton jp1_jb1,jp1_jb2,jp1_jb3;
	

	public static void main(String[] args) {
		QQloginClient qq =new QQloginClient();
		
	}

	public QQloginClient(){
		
		//处理北边
		jbl1=new JLabel(new ImageIcon("image/111.png"));
		
		//处理中部
		jp2=new JPanel(new GridLayout(3,3));
		jp2_jbl1=new JLabel("QQ号码",JLabel.CENTER);
		jp2_jbl2=new JLabel("QQ密码",JLabel.CENTER);
		jp2_jbl3=new JLabel("忘记密码",JLabel.CENTER);
		jp2_jbl3.setForeground(Color.blue);
		jp2_jbl4=new JLabel("申请密码保护",JLabel.CENTER);
		
		jp2_jb1=new JButton(new ImageIcon("image/clear.gif"));
		
		jp2_jtf=new JTextField();
		jp2_jpf=new JPasswordField();
		
		jp2_jcb1=new JCheckBox("隐身登录");
		jp2_jcb2=new JCheckBox("记住密码");
		
		//把控件按照顺序加入到jp2
		jp2.add(jp2_jbl1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jbl2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jbl3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jbl4);
		//选项卡窗口创建
		jtp=new JTabbedPane();
		jtp.add("QQ号码",jp2);	
		jtp.add("手机号码",jp3);
		jtp.add("电子邮件",jp4);
		jp3=new JPanel();
		jp4=new JPanel();
		
		//处理南部
		jp1=new JPanel();
		jp1_jb1=new JButton(new ImageIcon("image/denglu.gif"));
		//响应用户点击登录
		jp1_jb1.addActionListener(this);
				
		jp1_jb2=new JButton(new ImageIcon("image/quxiao.gif"));
		jp1_jb3=new JButton(new ImageIcon("image/xiangdao.gif"));
		
		//把三个按钮放入jp1
		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);
		
		this.add(jbl1,"North");
		this.add(jtp,"Center");
		this.add(jp1,"South");
		this.setSize(434,281);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setIconImage((new ImageIcon("image/qq.png")).getImage());
		//窗口在屏幕中间显示
		this.setLocationRelativeTo(null);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 如果用户点击登录
		if(e.getSource()==jp1_jb1){
			
			QqClientUser qc=new QqClientUser();
			User u=new User();
			u.setUserId(jp2_jtf.getText().trim());
			u.setPasswd(new String(jp2_jpf.getPassword()));
			
			if(qc.checkUser(u)==true){
				
				new QqFriendList(u.getUserId());
				//关闭登录界面
				this.dispose();
				
			}else{
				
				JOptionPane.showMessageDialog(this,"用户名密码错误");
				
			}
		}
		
	}
	
}
