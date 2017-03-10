package com.qq.server.model;

import java.util.HashMap;

public class ManageClientThread {
    //只能有一份hashmap
	public static  HashMap hm =new HashMap<String,ServerClientThread>();

   //向hashmap中添加一个客户端通讯进程
	public static void addClientThread(String uid,ServerClientThread ct){
		
		hm.put(uid, ct);
		
	}

     public static ServerClientThread getClientThread(String uid)
     {
    	 return (ServerClientThread) hm.get(uid);
     }






}
