package com.library.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tborroemessagee entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tborroemessagee", catalog = "libary")
public class Tborroemessagee implements java.io.Serializable {

	// Fields

	private Integer jieyuedeid;
	private Timestamp jieyuedeshijian;
	private String jieyuedereadermingzi;
	private String jieyuedecaozuoyuan;
	private String jieyuedetushubianhao;
	private Integer jieyeudecaozuoyuanbianhao;
	private String shudemingzi;
	private Integer duzhebianhao;

	// Constructors

	/** default constructor */
	public Tborroemessagee() {
	}

	/** full constructor */
	public Tborroemessagee(Timestamp jieyuedeshijian,
			String jieyuedereadermingzi, String jieyuedecaozuoyuan,
			String jieyuedetushubianhao, Integer jieyeudecaozuoyuanbianhao,
			String shudemingzi, Integer duzhebianhao) {
		this.jieyuedeshijian = jieyuedeshijian;
		this.jieyuedereadermingzi = jieyuedereadermingzi;
		this.jieyuedecaozuoyuan = jieyuedecaozuoyuan;
		this.jieyuedetushubianhao = jieyuedetushubianhao;
		this.jieyeudecaozuoyuanbianhao = jieyeudecaozuoyuanbianhao;
		this.shudemingzi = shudemingzi;
		this.duzhebianhao = duzhebianhao;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JIEYUEDEID", unique = true, nullable = false)
	public Integer getJieyuedeid() {
		return this.jieyuedeid;
	}

	public void setJieyuedeid(Integer jieyuedeid) {
		this.jieyuedeid = jieyuedeid;
	}

	@Column(name = "JIEYUEDESHIJIAN", nullable = false, length = 19)
	public Timestamp getJieyuedeshijian() {
		return this.jieyuedeshijian;
	}

	public void setJieyuedeshijian(Timestamp jieyuedeshijian) {
		this.jieyuedeshijian = jieyuedeshijian;
	}

	@Column(name = "JIEYUEDEREADERMINGZI", nullable = false)
	public String getJieyuedereadermingzi() {
		return this.jieyuedereadermingzi;
	}

	public void setJieyuedereadermingzi(String jieyuedereadermingzi) {
		this.jieyuedereadermingzi = jieyuedereadermingzi;
	}

	@Column(name = "JIEYUEDECAOZUOYUAN", nullable = false)
	public String getJieyuedecaozuoyuan() {
		return this.jieyuedecaozuoyuan;
	}

	public void setJieyuedecaozuoyuan(String jieyuedecaozuoyuan) {
		this.jieyuedecaozuoyuan = jieyuedecaozuoyuan;
	}

	@Column(name = "JIEYUEDETUSHUBIANHAO", nullable = false)
	public String getJieyuedetushubianhao() {
		return this.jieyuedetushubianhao;
	}

	public void setJieyuedetushubianhao(String jieyuedetushubianhao) {
		this.jieyuedetushubianhao = jieyuedetushubianhao;
	}

	@Column(name = "JIEYEUDECAOZUOYUANBIANHAO", nullable = false)
	public Integer getJieyeudecaozuoyuanbianhao() {
		return this.jieyeudecaozuoyuanbianhao;
	}

	public void setJieyeudecaozuoyuanbianhao(Integer jieyeudecaozuoyuanbianhao) {
		this.jieyeudecaozuoyuanbianhao = jieyeudecaozuoyuanbianhao;
	}

	@Column(name = "SHUDEMINGZI", nullable = false)
	public String getShudemingzi() {
		return this.shudemingzi;
	}

	public void setShudemingzi(String shudemingzi) {
		this.shudemingzi = shudemingzi;
	}

	@Column(name = "DUZHEBIANHAO", nullable = false)
	public Integer getDuzhebianhao() {
		return this.duzhebianhao;
	}

	public void setDuzhebianhao(Integer duzhebianhao) {
		this.duzhebianhao = duzhebianhao;
	}

}