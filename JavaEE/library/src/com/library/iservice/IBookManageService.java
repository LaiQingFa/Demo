package com.library.iservice;
import java.util.List;

import com.library.entity.Tshubook;

public interface IBookManageService {
   
	
	/**
	 * 新书入库
	 */
	public void addTbook(Tshubook tbook);
	/**
	 * 查询书籍信息
	 * @param bookName
	 * @return
	 */
	public Tshubook getBook(Integer bookId);
}
