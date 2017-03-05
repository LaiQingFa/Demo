package com.library.iservice;


import com.library.entity.Xueshnegbiao;




public interface IReaderMessageService {
   /**
    * 根据图书证编号获得读者实体
    * @param operatorName
    * @return
    */
   public Xueshnegbiao getTrederMessage (Integer xueshengbianhao);
   /**
    * 新增图书证
    * @param Xueshnegbiao
    */
   public void addXueshnegbiao(Xueshnegbiao Xueshnegbiao);
   
   /**
    * 修改图书证信息
    */
   public void updateXueshnegbiao(Xueshnegbiao Xueshnegbiao);
   
   /**
    * 删除图书证
    * @param Xueshnegbiao
    */
   public void deleteXueshnegbiao(Integer xueshengbianhao);
	
}
