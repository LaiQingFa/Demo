package com.library.dao.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;





public interface IBaseDao<T> {
	public Serializable Save(T t);// 保存


	public T Get(String hql);// hql不带参数的获得一个T类型的对象

	public T Get(String hql, Map<String, Object> params);// hql带参数的获得一个T类型的对象


	public void update(T t);// 更新一个T类型的对象
	/**
	 * 通过hql更新数据库
	 * @param hql
	 */
	public void update(String hql);
	/**
	 * 通过hql删除数据
	 * @param hql
	 */

	public void delete(String hql) ;

	
}
