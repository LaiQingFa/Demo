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

import com.library.entity.Tshubook;
import com.library.service.BookManageService;
/**
 * 
 * @author lqf
 *    2016.11.18
 */
@Component
@Scope("prototype")
@Action(value="BookManageAction",results={
		@Result(name="index",location="/index.jsp"),
		@Result(name="chaxunbook",location="/bookSearch.jsp"),
		@Result(name="BookDengjiInDEX",location="/bookDengji.jsp"),
		@Result(name = "BookDengji",type = "redirectAction", location = "BookManageAction!BookChaxun.action",params = {"bookkkId", "${bookkkId}"}),
		})
public class BookManageAction {
	@Autowired
	private BookManageService bookManageService;
	
	private Tshubook tbooklist;
	private String operatorName;
	private Integer operatorIdnum;
	private Tshubook tbook;
	
	private String bookName;  //书名
	private Integer bookType;   // 类型
	private String bookPublisherName;// 出版社名称
	private String bookAuthorName;// 作者名称
	private Integer bookPric;//图书价格
	private Timestamp bookStorageTime;//入库时间
	private String storageLocation;//存放位置
   
	private String bookIDnum;
	private Integer bookkkId;


	
	
	public String BookCHAXUNINdex(){

		return "chaxunbook";
		
	}
	
	public String  BookDengjiInDEX(){
		
			
		return "BookDengjiInDEX";
		
	}
	
	
	
	public String BookChaxun(){

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
						bookkkId=Integer.parseInt(bookIDnum);
						
						tbooklist=bookManageService.getBook(bookkkId);
					}else if(bookkkId!=null){
						tbooklist=bookManageService.getBook(bookkkId);
					}
					
					
					
				}
				   
			}
	
		
		    
			return "chaxunbook";		
	}
	
	
	
	
	
	
	public String BookDengji(){
		
	   HttpSession session = ServletActionContext.getRequest().getSession();
		if(session==null){
	
			return "index";
		}else{
			
			operatorName=(String) session.getAttribute("operatorName");
			operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
			if(operatorName==null||operatorName.equals("")){
				
				return "index";
			}else{
				
				tbook=new Tshubook();

				tbook.setBookkkName(bookName);
				tbook.setBookkkMakerrr(operatorName);
				tbook.setBookkkPric(bookPric);
				tbook.setBookkkPublisherName(bookPublisherName);
				tbook.setBookkkState(0);
				tbook.setBookkkStorageTime(bookStorageTime);
				tbook.setBookkkType(bookType);
				tbook.setBookkkStorageLocation(storageLocation);
				tbook.setBookkkAuthorName(bookAuthorName);
				
				bookManageService.addTbook(tbook);
			}
			   
		}
		bookkkId=tbook.getBookkkId();
		
		return "BookDengji";	
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


	public Tshubook getTbook() {
		return tbook;
	}


	public void setTbook(Tshubook tbook) {
		this.tbook = tbook;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}




	public Integer getBookType() {
		return bookType;
	}

	public void setBookType(Integer bookType) {
		this.bookType = bookType;
	}

	public String getBookPublisherName() {
		return bookPublisherName;
	}


	public void setBookPublisherName(String bookPublisherName) {
		this.bookPublisherName = bookPublisherName;
	}


	public String getBookAuthorName() {
		return bookAuthorName;
	}


	public void setBookAuthorName(String bookAuthorName) {
		this.bookAuthorName = bookAuthorName;
	}


	public Integer getBookPric() {
		return bookPric;
	}


	public void setBookPric(Integer bookPric) {
		this.bookPric = bookPric;
	}



	public Timestamp getBookStorageTime() {
		return bookStorageTime;
	}


	public void setBookStorageTime(Timestamp bookStorageTime) {
		this.bookStorageTime = bookStorageTime;
	}


	public String getStorageLocation() {
		return storageLocation;
	}


	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
	}


	public BookManageService getBookManageService() {
		return bookManageService;
	}


	public void setBookManageService(BookManageService bookManageService) {
		this.bookManageService = bookManageService;
	}

	public Tshubook getTbooklist() {
		return tbooklist;
	}

	public void setTbooklist(Tshubook tbooklist) {
		this.tbooklist = tbooklist;
	}

	public Integer getBookkkId() {
		return bookkkId;
	}

	public void setBookkkId(Integer bookkkId) {
		this.bookkkId = bookkkId;
	}

	public String getBookIDnum() {
		return bookIDnum;
	}

	public void setBookIDnum(String bookIDnum) {
		this.bookIDnum = bookIDnum;
	}


	
	
}
