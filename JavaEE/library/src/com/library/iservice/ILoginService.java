package com.library.iservice;

import com.library.entity.Toperator;


public interface ILoginService {
   /**
    * 根据管理员名字获得管理员实体
    * @param operatorName
    * @return
    */
   public Toperator getOperator (String operatorName);
	
	
}
