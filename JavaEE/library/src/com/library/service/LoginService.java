package com.library.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.library.dao.TOperatorDao;
import com.library.entity.Toperator;
import com.library.iservice.ILoginService;


@Controller("loginService")
public class LoginService implements ILoginService {

	@Autowired
	TOperatorDao OperatorDao;
	//登录
		@Override
		public Toperator getOperator(String operatorName) {
			Map<String, Object> params=new HashMap<String, Object>();
			params.put("operatorName", operatorName);
			String hql="from Toperator tr where tr.operatorName=:operatorName";
			Toperator operator = OperatorDao.Get(hql, params);
			return operator;
		}
}

