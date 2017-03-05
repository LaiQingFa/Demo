package com.library.action;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.library.entity.Tborroemessagee;
import com.library.entity.Tshubook;
import com.library.entity.Xueshnegbiao;
import com.library.service.BookManageService;
import com.library.service.TrederMessageService;
/**
 * 
 * @author lqf
 *    2016.11.17
 */
@Component
@Scope("prototype")
@Action(value="BorrowMessageAction",results={
		@Result(name="index",location="/index.jsp"),
		@Result(name="BorrowMessageChaxunINdex",location="/borrowSearch.jsp"),
		@Result(name="BorrowMessageDengjiINdex",location="/borrowDengji.jsp"),
		@Result(name = "BorrowMessageDengjisucess",type = "redirectAction", location = "BorrowMessageAction!BorrowMessageChaxun.action",params = {"jieyuedeid", "${jieyuedeid}"}),
		
		
		})
public class BorrowMessageAction {
	
	@Autowired
	private com.library.service.BorrowMessageService BorrowMessageService;
	@Autowired
	private BookManageService bookManageService;
	@Autowired
	private TrederMessageService rederMessageService;
	
	
	private Tshubook tbook;
	
	
	private String operatorName;
	private Integer operatorIdnum;	
	private String bookIDnum;

	private Tborroemessagee  borrowMessage;
	
	private Xueshnegbiao xueshengbianhao;
	/**
	 * 借阅编号 自动生成
	 */
	private Integer jieyuedeid; 
	/**
	 * 借阅的时间
	 */
	private Timestamp jieyuedeshijian;
	/**
	 * 借阅的读者的名字
	 */
	private String jieyuedereadermingzi;
	/**
	 * 登记借阅信息的操作员名字
	 */
	private String jieyuedecaozuoyuan;
	/**
	 * 借阅的图书编号
	 */
	private String jieyuedetushubianhao;
	/**
	 * 登记借阅的操作员编号
	 */
	private Integer jieyeudecaozuoyuanbianhao;
	/**
	 * 图书的名字
	 */
	private String shudemingzi;
	/**
	 * 图书证编号
	 */
	private Integer duzhebianhao;
	
	
	public String BorrowMessageDengjiINdex(){

		return "BorrowMessageDengjiINdex";
		
	}
	
	public String  BorrowMessageChaxunINdex(){
		
			
		return "BorrowMessageChaxunINdex";
		
	}
	
	
	public String BorrowMessageChaxun(){

		   HttpSession session = ServletActionContext.getRequest().getSession();
			if(session==null){
		
				return "index";
			}else{
				
				operatorName=(String) session.getAttribute("operatorName");
				operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
				if(operatorName==null||operatorName.equals("")){
					
					return "index";
				}else{
					if(bookIDnum!=null){
						jieyuedeid=Integer.parseInt(bookIDnum);					
						borrowMessage=BorrowMessageService.getTborrowMessageList(jieyuedeid);
					}else if(jieyuedeid!=null){
						borrowMessage=BorrowMessageService.getTborrowMessageList(jieyuedeid);
					}				
					
				}
				   
			}
	  
			return "BorrowMessageChaxunINdex";		
	}

	
	public String BorrowMessageDengjiINdex1(){
		
		  HttpSession session = ServletActionContext.getRequest().getSession();
			if(session==null){
		
				return "index";
			}else{
				
				operatorName=(String) session.getAttribute("operatorName");
				operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
				if(operatorName==null||operatorName.equals("")){
					
					return "index";
				}else{
					jieyeudecaozuoyuanbianhao=operatorIdnum;
					jieyuedecaozuoyuan=	operatorName;
					tbook=bookManageService.getBook(Integer.parseInt(jieyuedetushubianhao));
					shudemingzi=tbook.getBookkkName();		
					xueshengbianhao=rederMessageService.getTrederMessage(duzhebianhao);		
					jieyuedereadermingzi=xueshengbianhao.getXueshnegmingzi();
					
					
					
					borrowMessage=new Tborroemessagee();	
					borrowMessage.setDuzhebianhao(duzhebianhao);
					borrowMessage.setJieyeudecaozuoyuanbianhao(jieyeudecaozuoyuanbianhao);
					borrowMessage.setJieyuedecaozuoyuan(jieyuedecaozuoyuan);
					borrowMessage.setJieyuedereadermingzi(jieyuedereadermingzi);
					borrowMessage.setJieyuedeshijian(jieyuedeshijian);
					borrowMessage.setJieyuedetushubianhao(jieyuedetushubianhao);
					borrowMessage.setShudemingzi(shudemingzi);
					
					BorrowMessageService.addBookBorrowMessage(borrowMessage);
					
					
				}
				   
			}
	  
			jieyuedeid=borrowMessage.getJieyuedeid();
		
		return "BorrowMessageDengjisucess";
		
	}
	
	
	
	
	
	
	public com.library.service.BorrowMessageService getBorrowMessageService() {
		return BorrowMessageService;
	}

	public void setBorrowMessageService(
			com.library.service.BorrowMessageService borrowMessageService) {
		BorrowMessageService = borrowMessageService;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public Integer getOperatorIdnum() {
		return operatorIdnum;
	}

	public void setOperatorIdnum(Integer operatorIdnum) {
		this.operatorIdnum = operatorIdnum;
	}

	public String getBookIDnum() {
		return bookIDnum;
	}

	public void setBookIDnum(String bookIDnum) {
		this.bookIDnum = bookIDnum;
	}






	public Tborroemessagee getBorrowMessage() {
		return borrowMessage;
	}

	public void setBorrowMessage(Tborroemessagee borrowMessage) {
		this.borrowMessage = borrowMessage;
	}

	public Integer getJieyuedeid() {
		return jieyuedeid;
	}

	public void setJieyuedeid(Integer jieyuedeid) {
		this.jieyuedeid = jieyuedeid;
	}

	public Timestamp getJieyuedeshijian() {
		return jieyuedeshijian;
	}

	public void setJieyuedeshijian(Timestamp jieyuedeshijian) {
		this.jieyuedeshijian = jieyuedeshijian;
	}

	public String getJieyuedereadermingzi() {
		return jieyuedereadermingzi;
	}

	public void setJieyuedereadermingzi(String jieyuedereadermingzi) {
		this.jieyuedereadermingzi = jieyuedereadermingzi;
	}

	public String getJieyuedecaozuoyuan() {
		return jieyuedecaozuoyuan;
	}

	public void setJieyuedecaozuoyuan(String jieyuedecaozuoyuan) {
		this.jieyuedecaozuoyuan = jieyuedecaozuoyuan;
	}

	public String getJieyuedetushubianhao() {
		return jieyuedetushubianhao;
	}

	public void setJieyuedetushubianhao(String jieyuedetushubianhao) {
		this.jieyuedetushubianhao = jieyuedetushubianhao;
	}

	public Integer getJieyeudecaozuoyuanbianhao() {
		return jieyeudecaozuoyuanbianhao;
	}

	public void setJieyeudecaozuoyuanbianhao(Integer jieyeudecaozuoyuanbianhao) {
		this.jieyeudecaozuoyuanbianhao = jieyeudecaozuoyuanbianhao;
	}

	public String getShudemingzi() {
		return shudemingzi;
	}

	public void setShudemingzi(String shudemingzi) {
		this.shudemingzi = shudemingzi;
	}

	public Integer getDuzhebianhao() {
		return duzhebianhao;
	}

	public void setDuzhebianhao(Integer duzhebianhao) {
		this.duzhebianhao = duzhebianhao;
	}
	
	
	
	
	
	
	
	
	
	
	

}
