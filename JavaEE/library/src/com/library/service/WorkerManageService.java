package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.library.dao.TOperatorDao;
import com.library.entity.Toperator;
import com.library.iservice.IWorkerMnageService;

@Controller("WorkerManageService")
public class WorkerManageService implements  IWorkerMnageService {
	@Autowired
	TOperatorDao tOperatorDao;
	
	
	@Override
	public Toperator getToperator(Integer operatorIdnum) {
		
		String hql="from Toperator tr where tr.operatorIdnum="+operatorIdnum;		
		Toperator operator = tOperatorDao.Get(hql);
		
		return operator;
	}

	@Override
	public void addOperator(Toperator operator) {
		// TODO Auto-generated method stub
		tOperatorDao.Save(operator);
	}

	@Override
	public void updateOperator(Toperator operator) {
		// TODO Auto-generated method stub
		tOperatorDao.update(operator);
	}
//   /**
//    * 修改   将该用户禁用
//    */
//	@Override
//	public void deleteOperator(Integer operatorIdnum) {
//
//		String hql="update Toperator tr set tr.operatorState=2 where tr.operatorIdnum="+operatorIdnum;
//		tOperatorDao.update(hql);
//	}

	@Override
	public void deleteOperator(Integer operatorIdnum1) {
		// TODO Auto-generated method stub
		String hql=" delete from Toperator tr where tr.operatorIdnum="+ operatorIdnum1;	
		tOperatorDao.delete(hql);
	}

}
