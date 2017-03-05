package com.library.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.library.entity.Toperator;
/**
 * 
 * @author lqf
 *    2016.11.14
 */
@Component
@Scope("prototype")
@Action(value="WorkerMnageAction",results={
		@Result(name="index",location="/index.jsp"),
		@Result(name="loginIndex",location="/loginIndex.jsp"),
		@Result(name="addWorkerIndex",location="/addWorker.jsp"),
		@Result(name="searchWorker",location="/WorkerManage.jsp"),
		@Result(name="404page",location="/404.jsp"),
		@Result(name="updateWorkerINdex",location="/WorkerUpdate.jsp"),
		@Result(name = "updateWorker",type = "redirectAction", location = "WorkerMnageAction!searchWorker.action",
		params = {"operatorIdnum1", "${operatorIdnum1}"}),
		@Result(name = "addWorker",type = "redirectAction", location = "WorkerMnageAction!searchWorker.action",
		params = {"operatorIdnum1", "${operatorIdnum}"}),

	   })
public class WorkerMnageAction {

	@Autowired
	private com.library.service.WorkerManageService workerManageService;
	
	private Integer operatorIdnum;
	private String operatorName;
	private String operatorPasscode;
	/**
	 * operatorState 用于判断权限   0超级管理员  1普通员工  2禁用
	 */
	private Integer operatorState;
	private Integer operatorPhone;
	private String operatorName1;
	private Integer operatorIdnum1;
	private Toperator operator;

	private Integer operatorStateIndex;
	
	public String addWorkerIndex(){
		
		 HttpSession session = ServletActionContext.getRequest().getSession();
		if(session==null){
			
			return "index";
		}else{
			
			operatorName=(String) session.getAttribute("operatorName");
			operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
			operatorStateIndex=(Integer) session.getAttribute("operatorState");	
			
			if(operatorStateIndex==0){
				
					if(operatorName==null||operatorName.equals(""))
					{
						
						return "index";
					}
					
			
			}else
			{
				
				return "loginIndex";
			}
			
			
	}
		
		return "addWorkerIndex";
		
	}
	
	public String workerManageIndex(){
		
		  HttpSession session = ServletActionContext.getRequest().getSession();
				if(session==null){
			
					return "index";
				}else{
					
					operatorName=(String) session.getAttribute("operatorName");
					operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
					operatorStateIndex=(Integer) session.getAttribute("operatorState");	
					
					if(operatorStateIndex==0||operatorStateIndex==1){
						
							if(operatorName==null||operatorName.equals(""))
							{
								
								return "index";
							}
							
					
					}else
					{
						
						return "index";
					}
					
					
			}
				
		return "searchWorker";
		
	}

	public String updateWorkerINdex(){
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session==null){
	
			return "index";
		}else{
			
			operatorName=(String) session.getAttribute("operatorName");
			operatorIdnum=(Integer) session.getAttribute("operatorIdnum");
			operatorStateIndex=(Integer) session.getAttribute("operatorState");	
			if(operatorName==null||operatorName.equals("")){
				
				return "index";
			}
			   
		}
	
		return "updateWorkerINdex";
		
	}
	
	 public  String searchWorker(){
		 
		  HttpSession session = ServletActionContext.getRequest().getSession();
			if(session==null){
		
				return "index";
			}else{
				
				operatorName=(String) session.getAttribute("operatorName");
				operatorIdnum=(Integer) session.getAttribute("operatorIdnum");
				operatorStateIndex=(Integer) session.getAttribute("operatorState");	
				if(operatorName==null||operatorName.equals("")){
					
					return "index";
				}else{
					
					if(operatorIdnum1==null){								
						
					}else{
						operatorIdnum=operatorIdnum1;
						operator=workerManageService.getToperator(operatorIdnum);
						if(operator==null){
							
						}else{
						
						    operatorPasscode=operator.getOperatorPasscode();	
						}
					}
						
				}
				   
			}
		 
		 
		 
		return "searchWorker";
		 
	 }
	
	
	
	
	public String addWorker(){
		
		
		  HttpSession session = ServletActionContext.getRequest().getSession();
			if(session==null){
		
				return "index";
			}else{
				
				operatorName=(String) session.getAttribute("operatorName");
				operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
				if(operatorName==null||operatorName.equals("")){
					
					return "index";
				}else{
					
					if(operatorName1!=null&&operatorPasscode!=null){
											
						operator=new Toperator();
						
						operator.setOperatorState(1);
						operator.setOperatorName(operatorName1);
						operator.setOperatorPasscode(operatorPasscode);
						operator.setOperatorPhone(operatorPhone);
								
						workerManageService.addOperator(operator);
						
						
						operatorIdnum=operator.getOperatorIdnum();
					}
						
				}
				   
			}
		
		return "addWorker";
	}
	
	
	public String updateWorker(){
		
		  HttpSession session = ServletActionContext.getRequest().getSession();
			if(session==null){
		
				return "index";
			}else{
				
				operatorName=(String) session.getAttribute("operatorName");
				operatorIdnum=(Integer) session.getAttribute("operatorIdnum");
				operatorStateIndex=(Integer) session.getAttribute("operatorState");
				
				
				
				
				if(operatorName==null||operatorName.equals("")){
					
					return "index";
				}else{
					
					if(operatorName1!=null&&operatorPasscode!=null){
											
						operator=workerManageService.getToperator(operatorIdnum1);
						if(operator==null){
							return "404page";
						}else
						{
						operator.setOperatorState(operatorState);
						operator.setOperatorName(operatorName1);
						operator.setOperatorPhone(operatorPhone);
								
						workerManageService.updateOperator(operator);
						
						}
						operatorIdnum1=operator.getOperatorIdnum();
					}
						
				}
				   
			}
		
		return "updateWorker";
		
	}
	
	public String editWorker(){
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session==null){
	
			return "index";
		}else{
			
			operatorName=(String) session.getAttribute("operatorName");
			operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
			if(operatorName==null||operatorName.equals("")){
				
				return "index";
			}else{
				
				if(operatorIdnum1!=null){
										
					operator=workerManageService.getToperator(operatorIdnum1);
					if(operator==null){
						return "404page";
					}else
					{
						workerManageService.deleteOperator(operatorIdnum1);
					
					}
					
				}
					
			}
			   
		}
		
		return "updateWorker";
		
	}
	
	
	
	
	
	public Integer getOperatorIdnum() {
		return operatorIdnum;
	}

	public void setOperatorIdnum(Integer operatorIdnum) {
		this.operatorIdnum = operatorIdnum;
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

	public com.library.service.WorkerManageService getWorkerManageService() {
		return workerManageService;
	}

	public void setWorkerManageService(
			com.library.service.WorkerManageService workerManageService) {
		this.workerManageService = workerManageService;
	}

	public Integer getOperatorState() {
		return operatorState;
	}

	public void setOperatorState(Integer operatorState) {
		this.operatorState = operatorState;
	}

	public Toperator getOperator() {
		return operator;
	}

	public void setOperator(Toperator operator) {
		this.operator = operator;
	}

	public String getOperatorName1() {
		return operatorName1;
	}

	public Integer getOperatorIdnum1() {
		return operatorIdnum1;
	}

	public void setOperatorIdnum1(Integer operatorIdnum1) {
		this.operatorIdnum1 = operatorIdnum1;
	}

	public void setOperatorName1(String operatorName1) {
		this.operatorName1 = operatorName1;
	}

	public Integer getOperatorStateIndex() {
		return operatorStateIndex;
	}

	public void setOperatorStateIndex(Integer operatorStateIndex) {
		this.operatorStateIndex = operatorStateIndex;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
