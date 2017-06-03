package com.ssmdemo.controller;
 
import java.util.List;
 










import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssmdemo.entity.Tmessage;
import com.ssmdemo.entity.Tuser;
import com.ssmdemo.service.TmessageServica;
import com.ssmdemo.service.TuserService;


// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("/loginCheckController")
public class LoginCheckController {
    @Autowired
    TuserService tuserService;
    @Autowired
    TmessageServica tmessageService;
 /**
  * 登录进行简单校验
  * @param username
  * @param password
  * @return
  */
    @RequestMapping("/loginCheck")
    public ModelAndView listCategory(String username,String password){
        ModelAndView mav = new ModelAndView();

       Tuser u=tuserService.getUserByname(username);
         
       if(u!=null){
    	   
    	   if(password.endsWith(u.getPassword())){
    		   
    		   List<Tmessage> list=tmessageService.list(u.getUserid());
    		   
    		   // 放入转发参数
    	        mav.addObject("u", u);
    	        mav.addObject("list", list);
    	        // 放入jsp路径
    	        mav.setViewName("login");
    	   }else{
    		   
    		   mav.setViewName("index");
    	   }
    	   
       }else{
        mav.setViewName("index");
       }
       
        return mav;
    }
 
}