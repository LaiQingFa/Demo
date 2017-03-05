package com.library.iservice;

import java.util.List;

import com.library.entity.Tborroemessagee;
import com.library.entity.Tshubook;

public interface IBookBorrowService {
   
	
	/**
	 * 借阅新增记录
	 */
	public void addBookBorrowMessage(Tborroemessagee tborrowmessage);

	
	/**
	 * 按借阅编号查询借阅记录
	 * @param borrowId
	 * @return
	 */
	public Tborroemessagee getTborrowMessageList(Integer borrowwwId);
	
	
}
