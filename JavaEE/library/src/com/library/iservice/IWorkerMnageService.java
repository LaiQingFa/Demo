package com.library.iservice;

import com.library.entity.Toperator;


public interface IWorkerMnageService {
   /**
    * 根据员工编号获得员工实体
    * @param operatorName
    * @return
    */
   public Toperator getToperator (Integer operatorIdnum);
   /**
    * 新增员工
    * @param Xueshnegbiao
    */
   public void addOperator(Toperator operator);
   
   /**
    * 修改员工信息
    */
   public void updateOperator(Toperator operator);
   
   /**
    * 删除员工   
    * @param Xueshnegbiao
    */
   public void deleteOperator(Integer operatorIdnum1);
	
}
