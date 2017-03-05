package com.library.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.library.action.base.BaseAction;
import com.library.entity.Toperator;
import com.library.service.LoginService;

/**
 * 
 * @author lqf
 *    2016.11.23
 */
@Component
@Scope("prototype")
@Action(value="LoginOutAction",results={
		@Result(name="loginindex",location="/loginIndex.jsp"),
		@Result(name="index",location="/index.jsp"),
		})

public class LoginOutAction extends BaseAction {
	@Autowired
	private LoginService loginService;
	private String operatorName;//账号
	private String operatorPasscode;//密码
	private Integer operatorState;//状态  0 超管  1员工  2禁用
	private Integer operatorPhone;
	private Integer operatorIdnum;
	private Toperator tOperator;


/**
 * 登陆校验检查
 * @return
 */
	public String loginCheck(){
		
			
		if (operatorName.equals("") || operatorPasscode.equals("")) {
			return "index";
		}	
		
		tOperator=loginService.getOperator(operatorName);
		
		if (tOperator==null||tOperator.getOperatorState()==2){			
			return "index";
		}else{
			
			//校验
			
			String passcode=tOperator.getOperatorPasscode();
			
			if(operatorPasscode.equals(passcode)){
				
				operatorIdnum=tOperator.getOperatorIdnum();
				operatorName=tOperator.getOperatorName();	
				operatorState=tOperator.getOperatorState();
				
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.removeAttribute("operatorName");
				session.removeAttribute("operatorIdnum");
				session.removeAttribute("operatorState");
				
				session.setAttribute("operatorName", operatorName);
				session.setAttribute("operatorIdnum", operatorIdnum);	
				session.setAttribute("operatorState", operatorState);
				
			}else{
	
				return "index";
			}
		}
		return "loginindex";
	
		}		


	public String LogOut(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		
		session.removeAttribute("operatorName");
		session.removeAttribute("operatorIdnum");	
		session.removeAttribute("operatorState");
		
		return "index";
		
	}
	
	public String loginindex(){
		
		
		return "loginindex";
		
	}
	
	
	
	
	public Toperator gettOperator() {
		return tOperator;
	}



	public void settOperator(Toperator tOperator) {
		this.tOperator = tOperator;
	}

	public LoginService getLoginService() {
		return loginService;
	}


	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}


	public String getOperatorName() {
		return operatorName;
	}


	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}


	public String getOperatorPasscode() {
		return operatorPasscode;
	}


	public void setOperatorPasscode(String operatorPasscode) {
		this.operatorPasscode = operatorPasscode;
	}





	public Integer getOperatorPhone() {
		return operatorPhone;
	}


	public void setOperatorPhone(Integer operatorPhone) {
		this.operatorPhone = operatorPhone;
	}


	public Integer getOperatorIdnum() {
		return operatorIdnum;
	}


	public void setOperatorIdnum(Integer operatorIdnum) {
		this.operatorIdnum = operatorIdnum;
	}



	public Integer getOperatorState() {
		return operatorState;
	}


	public void setOperatorState(Integer operatorState) {
		this.operatorState = operatorState;
	}
	

	
	
	
}
