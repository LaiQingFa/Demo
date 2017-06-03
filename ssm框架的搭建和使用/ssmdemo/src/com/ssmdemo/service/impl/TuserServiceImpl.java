package com.ssmdemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmdemo.entity.Tuser;
import com.ssmdemo.mapper.TuserMapper;
import com.ssmdemo.service.TuserService;

@Service
public class TuserServiceImpl implements TuserService{
	@Autowired
	TuserMapper tuserMapper;

	@Override
	public Tuser getUser(Integer id) {
		// TODO Auto-generated method stub
		return tuserMapper.selectByPrimaryKey(id);
	}

	@Override
	public Tuser getUserByname(String username) {
		// TODO Auto-generated method stub
		return tuserMapper.selectByUsername(username);
	}
	

}
