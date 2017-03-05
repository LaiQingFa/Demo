package com.library.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.library.entity.Tborroemessagee;
import com.library.iservice.IBookBorrowService;
/**
 * 
 * @author lqf
 *
 */
@Controller("BorrowMessageService")
public class BorrowMessageService implements IBookBorrowService {
	@Autowired
	private com.library.dao.TBorrowMessageDao TBorrowMessageDao;
	
	
	@Override
	public void addBookBorrowMessage(Tborroemessagee tborrowmessage) {
		TBorrowMessageDao.Save(tborrowmessage);
		
	}

	@Override
	public Tborroemessagee getTborrowMessageList(Integer jieyuedeid) {
		Tborroemessagee Tborrowmessage;
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("jieyuedeid", jieyuedeid);
		String hql="from Tborroemessagee te where te.jieyuedeid ="+jieyuedeid ;
		Tborrowmessage= TBorrowMessageDao.Get(hql);
		return Tborrowmessage;
	}


	
	
	

}
