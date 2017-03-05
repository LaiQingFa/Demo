package com.library.dao.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("baseDao")
public class BaseDao<T> implements IBaseDao<T> {
	 @Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Serializable Save(T t) {
		return this.getCurrentSession().save(t);
	}


	@Override
	public T Get(String hql) {
		Query query = this.getCurrentSession().createQuery(hql);
		List<T> l = query.list();
		if (l != null && l.size() > 0) {
			return l.get(0);
		}
		return null;
	}

	@Override
	public T Get(String hql, Map<String, Object> params) {

		Query query = this.getCurrentSession().createQuery(hql);

		if (params != null && !params.isEmpty()) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}

		List<T> l = query.list();
		if (l != null && l.size() > 0) {
			return l.get(0);
		}

		return null;
	}


	@Override
	public void update(T t) {

		this.getCurrentSession().merge(t);

	}

	@Override
	public void delete(String hql) {
		update(hql);

	}

	@Override
	public void update(String hql) {
		Query query = this.getCurrentSession().createQuery(hql);
		query.executeUpdate();
	}



	public Double sumf(String hql){
		Query query = this.getCurrentSession().createQuery(hql);
		Object obj = query.uniqueResult();
		if(obj == null){
			obj = "0";
		}
		return Double.parseDouble(obj.toString()) ;
	}


	
	
}
