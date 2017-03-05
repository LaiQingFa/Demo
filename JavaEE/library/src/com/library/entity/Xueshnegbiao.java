package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Xueshnegbiao entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "xueshnegbiao", catalog = "libary")
public class Xueshnegbiao implements java.io.Serializable {

	// Fields

	private Integer xueshengbianhao;
	private String xeushnegdianhua;
	private Integer xueshengxingbie;
	private String xueshengxuehao;
	private Integer xueshengzhuantai;
	private String muqianjiedeshu;
	private String xueshnegmingzi;

	// Constructors

	/** default constructor */
	public Xueshnegbiao() {
	}

	/** full constructor */
	public Xueshnegbiao(String xeushnegdianhua, Integer xueshengxingbie,
			String xueshengxuehao, Integer xueshengzhuantai,
			String muqianjiedeshu, String xueshnegmingzi) {
		this.xeushnegdianhua = xeushnegdianhua;
		this.xueshengxingbie = xueshengxingbie;
		this.xueshengxuehao = xueshengxuehao;
		this.xueshengzhuantai = xueshengzhuantai;
		this.muqianjiedeshu = muqianjiedeshu;
		this.xueshnegmingzi = xueshnegmingzi;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "XUESHENGBIANHAO", unique = true, nullable = false)
	public Integer getXueshengbianhao() {
		return this.xueshengbianhao;
	}

	public void setXueshengbianhao(Integer xueshengbianhao) {
		this.xueshengbianhao = xueshengbianhao;
	}

	@Column(name = "XEUSHNEGDIANHUA", length = 11)
	public String getXeushnegdianhua() {
		return this.xeushnegdianhua;
	}

	public void setXeushnegdianhua(String xeushnegdianhua) {
		this.xeushnegdianhua = xeushnegdianhua;
	}

	@Column(name = "XUESHENGXINGBIE")
	public Integer getXueshengxingbie() {
		return this.xueshengxingbie;
	}

	public void setXueshengxingbie(Integer xueshengxingbie) {
		this.xueshengxingbie = xueshengxingbie;
	}

	@Column(name = "XUESHENGXUEHAO", length = 11)
	public String getXueshengxuehao() {
		return this.xueshengxuehao;
	}

	public void setXueshengxuehao(String xueshengxuehao) {
		this.xueshengxuehao = xueshengxuehao;
	}

	@Column(name = "XUESHENGZHUANTAI")
	public Integer getXueshengzhuantai() {
		return this.xueshengzhuantai;
	}

	public void setXueshengzhuantai(Integer xueshengzhuantai) {
		this.xueshengzhuantai = xueshengzhuantai;
	}

	@Column(name = "MUQIANJIEDESHU")
	public String getMuqianjiedeshu() {
		return this.muqianjiedeshu;
	}

	public void setMuqianjiedeshu(String muqianjiedeshu) {
		this.muqianjiedeshu = muqianjiedeshu;
	}

	@Column(name = "XUESHNEGMINGZI")
	public String getXueshnegmingzi() {
		return this.xueshnegmingzi;
	}

	public void setXueshnegmingzi(String xueshnegmingzi) {
		this.xueshnegmingzi = xueshnegmingzi;
	}

}