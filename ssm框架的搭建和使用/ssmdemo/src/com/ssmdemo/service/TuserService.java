package com.ssmdemo.service;
 
import java.util.List;

import com.ssmdemo.entity.Tuser;

public interface TuserService {
 
    public Tuser getUser(Integer id);
    
    public Tuser getUserByname(String  username);
 
}