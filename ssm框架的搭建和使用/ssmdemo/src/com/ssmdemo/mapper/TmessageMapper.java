package com.ssmdemo.mapper;

import java.util.List;

import com.ssmdemo.entity.Tmessage;

public interface TmessageMapper {
    int deleteByPrimaryKey(Integer messageid);

    int insert(Tmessage record);

    int insertSelective(Tmessage record);

    Tmessage selectByPrimaryKey(Integer messageid);

    int updateByPrimaryKeySelective(Tmessage record);

    int updateByPrimaryKey(Tmessage record);
    
    List<Tmessage> list(Integer userid);
}