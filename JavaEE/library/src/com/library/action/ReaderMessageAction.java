package com.library.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.library.entity.Xueshnegbiao;
import com.library.service.TrederMessageService;
/**
 * 
 * @author lqf
 *    2016.11.14
 */

@Component
@Scope("prototype")
@Action(value="ReaderMessageAction",results={
		@Result(name="index",location="/index.jsp"),
		@Result(name="addReaderIndex",location="/AddReader.jsp"),
		@Result(name="chauxnreder",location="/SearchReader.jsp"),
		@Result(name="404page",location="/404.jsp"),
		@Result(name = "addReader12",type = "redirectAction", location = "ReaderMessageAction!searchReader.action",
		params = {"xueshengbianhao", "${xueshengbianhao}"}),
		
		
	   })
public class ReaderMessageAction {

	@Autowired
	private TrederMessageService trederMessageService;
	private Xueshnegbiao xueshnegbiao;
	
	private String operatorName;
	private Integer operatorIdnum;	
	
	private String bianhao;
	
	private String xeushnegdianhua;
	private String xueshengxingbie;
	private String xueshengxuehao;

	
	
	private Integer xueshengbianhao;
	private Integer xshengxingbie;
	private Integer xshengzhuantai;
	
	private String muqianjiedeshu;	
	private String xueshnegmingzi;
	
	public  String addReaderIndex(){
		
	
		return "addReaderIndex";
		
		
	}
	
	
	public  String manageReaderIndex(){
		
		
		return "chauxnreder";
		
		
	}
	
	
	
	public String Readerxinzneng(){

		xshengxingbie=Integer.parseInt(xueshengxingbie);

		//符合规范的才给登记
		if(xueshnegmingzi==null||xueshnegmingzi.equals("")||xeushnegdianhua.equals("")||xeushnegdianhua==null){
			return "index";
		}
		else
		{
		if(xshengxingbie==0||xshengxingbie==1){
			
			HttpSession session = ServletActionContext.getRequest().getSession();
		  	  
			if(session==null){
		            			
				return "index";
				
			}else{
				
				operatorName=(String) session.getAttribute("operatorName");
				
				if(operatorName==null||operatorName.equals("")){
					
					return "index";
				}else{
					
					operatorIdnum=(Integer) session.getAttribute("operatorIdnum");	
					
					xueshnegbiao =new Xueshnegbiao();
					
					xueshnegbiao.setXueshnegmingzi(xueshnegmingzi);
					xueshnegbiao.setXeushnegdianhua(xeushnegdianhua);
					xueshnegbiao.setMuqianjiedeshu(muqianjiedeshu);
					xueshnegbiao.setXueshengxingbie(xshengxingbie);
					xueshnegbiao.setXueshengxuehao(xeushnegdianhua);
					//状态0代表未借书   1代表借书，没还书前不能再借
					xueshnegbiao.setXueshengzhuantai(0);

					trederMessageService.addXueshnegbiao(xueshnegbiao);
					
					
				          }
			         }
			  xueshengbianhao=xueshnegbiao.getXueshengbianhao();
	          }
			
		}
		
		return "addReader12";
       }

	
	
	
    public String searchReader(){
    	
    	if(bianhao==null){
    		
    		bianhao=xueshengbianhao+"";
    	
    	}
    	
    	xueshengbianhao=Integer.parseInt(bianhao);
    	
    	HttpSession session = ServletActionContext.getRequest().getSession();
	  	  
		if(session==null||xueshengbianhao==null||xueshengbianhao.equals("")){
	            			
			return "index";
			
		}else{
			
			operatorName=(String) session.getAttribute("operatorName");
			
			if(operatorName==null||operatorName.equals("")){
				
				return "index";
			}else{
				
				xueshnegbiao =new Xueshnegbiao();
				xueshnegbiao=trederMessageService.getTrederMessage(xueshengbianhao);
				
			     }
			
		   }
    	
    
		return "chauxnreder";
    	
  
    }

    
    
    
    public String deleteTuShu(){
    	
    	
    	if(xueshengbianhao==null){
    		
    		return "404page";
    	}else{
    	
    	trederMessageService.deleteXueshnegbiao(xueshengbianhao);
    	
    	}

		return "addReader12";
 		
    	
    }
    
    public String updateTuShu(){
    	
    	
    	
    	
        Xueshnegbiao xueshnegbiao=trederMessageService.getTrederMessage(xueshengbianhao);
   	
		xueshnegbiao.setXueshnegmingzi(xueshnegmingzi);
		xueshnegbiao.setXeushnegdianhua(xeushnegdianhua);
		xueshnegbiao.setMuqianjiedeshu(muqianjiedeshu);
		xueshnegbiao.setXueshengxingbie(xshengxingbie);
		xueshnegbiao.setXueshengxuehao(xeushnegdianhua);

		trederMessageService.updateXueshnegbiao(xueshnegbiao);
    	
		
    	return "addReader12";
    }
    
    
    
    
	public TrederMessageService getTrederMessageService() {
		return trederMessageService;
	}


	public void setTrederMessageService(TrederMessageService trederMessageService) {
		this.trederMessageService = trederMessageService;
	}


	public Xueshnegbiao getXueshnegbiao() {
		return xueshnegbiao;
	}


	public void setXueshnegbiao(Xueshnegbiao xueshnegbiao) {
		this.xueshnegbiao = xueshnegbiao;
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


	public String getBianhao() {
		return bianhao;
	}


	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}


	public String getXeushnegdianhua() {
		return xeushnegdianhua;
	}


	public void setXeushnegdianhua(String xeushnegdianhua) {
		this.xeushnegdianhua = xeushnegdianhua;
	}


	public String getXueshengxingbie() {
		return xueshengxingbie;
	}


	public void setXueshengxingbie(String xueshengxingbie) {
		this.xueshengxingbie = xueshengxingbie;
	}


	public String getXueshengxuehao() {
		return xueshengxuehao;
	}


	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}


	public Integer getXueshengbianhao() {
		return xueshengbianhao;
	}


	public void setXueshengbianhao(Integer xueshengbianhao) {
		this.xueshengbianhao = xueshengbianhao;
	}


	public Integer getXshengxingbie() {
		return xshengxingbie;
	}


	public void setXshengxingbie(Integer xshengxingbie) {
		this.xshengxingbie = xshengxingbie;
	}


	public Integer getXshengzhuantai() {
		return xshengzhuantai;
	}


	public void setXshengzhuantai(Integer xshengzhuantai) {
		this.xshengzhuantai = xshengzhuantai;
	}


	public String getMuqianjiedeshu() {
		return muqianjiedeshu;
	}


	public void setMuqianjiedeshu(String muqianjiedeshu) {
		this.muqianjiedeshu = muqianjiedeshu;
	}


	public String getXueshnegmingzi() {
		return xueshnegmingzi;
	}


	public void setXueshnegmingzi(String xueshnegmingzi) {
		this.xueshnegmingzi = xueshnegmingzi;
	}
	
	
	
	





  }
     
     
     

     
