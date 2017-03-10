package com.qq.client.tools;

import java.util.HashMap;

/**
 * z这是一个管理通讯客户端与服务器保持通讯的线程类
 * @author Administrator
 *
 */
public class ManageConServerThread {

	private static HashMap hm=new HashMap<String,ClientConServerThread>();
	//把创建好的ClientConServerThread放入到hashmap
	
	
	public  static void addClientConServerThread(String qqId,ClientConServerThread ccst)
	{
		hm.put(qqId, ccst);
		
	}
	//可以通过QQid取得该线程
	
	public  static ClientConServerThread getClientConServerThread(String qqId)
	{
		return (ClientConServerThread) hm.get(qqId);
	
	}
	
}
