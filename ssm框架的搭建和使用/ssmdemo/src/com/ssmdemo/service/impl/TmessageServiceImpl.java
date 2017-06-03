package com.ssmdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssmdemo.entity.Tmessage;
import com.ssmdemo.mapper.TmessageMapper;

@Service
public class TmessageServiceImpl  implements  com.ssmdemo.service.TmessageServica{
	@Autowired 
	TmessageMapper  tmessageMapper;
	
	@Override
	public List<Tmessage> list(Integer userid) {
		// TODO Auto-generated method stub
		return tmessageMapper.list(userid);
	}

}
