package com.library.service;
/**
 * 
 * @author lqf
 * 2016.11.23
 *   2511695066@qq.com
 *
 */
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.library.dao.TbookDao;
import com.library.entity.Tshubook;
import com.library.iservice.IBookManageService;
@Controller("BookManageService")
public class BookManageService implements IBookManageService {

	@Autowired
	private TbookDao bookdao;
	
	
	@Override
	public void addTbook(Tshubook tbook) {
		bookdao.Save(tbook);	
	}


	@Override
	public Tshubook getBook(Integer bookkkId) {
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("bookkkId", bookkkId);
		String hql="from Tshubook tr where tr.bookkkId="+bookkkId;
		Tshubook book = bookdao.Get(hql);
		return book;
	}
	

}
