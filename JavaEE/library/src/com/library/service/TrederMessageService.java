package com.library.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.library.dao.TReaderMessageDao;
import com.library.entity.Xueshnegbiao;
import com.library.iservice.IReaderMessageService;
/**
 * 
 * @author lqf
 *
 */

@Controller("TrederMessageService")
public class TrederMessageService implements IReaderMessageService {

	@Autowired
	TReaderMessageDao ReaderMessageDao;

		@Override
		public Xueshnegbiao getTrederMessage(Integer xueshengbianhao) {
			Map<String, Object> params=new HashMap<String, Object>();
			params.put("xueshengbianhao", xueshengbianhao);
			String hql="from Xueshnegbiao tr where tr.xueshengbianhao="+xueshengbianhao;
			Xueshnegbiao trederMessage = ReaderMessageDao.Get(hql);
			return trederMessage;
		}

		@Override
		public void addXueshnegbiao(Xueshnegbiao Xueshnegbiao) {
			ReaderMessageDao.Save(Xueshnegbiao);
			
		}

		@Override
		public void updateXueshnegbiao(Xueshnegbiao Xueshnegbiao) {
			
			ReaderMessageDao.update(Xueshnegbiao);
			
		}

		@Override
		public void deleteXueshnegbiao(Integer xueshengbianhao) {
			String hql="delete from Xueshnegbiao xo where xo.xueshengbianhao="+xueshengbianhao;
			ReaderMessageDao.delete(hql);
		}

}

