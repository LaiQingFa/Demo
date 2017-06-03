package com.ssmdemo.mapper;

import com.ssmdemo.entity.Tuser;

public interface TuserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer userid);
    
    Tuser selectByUsername(String  username);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
}