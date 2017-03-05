package com.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Toperator entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "toperator", catalog = "libary")
public class Toperator implements java.io.Serializable {

	// Fields

	private Integer operatorIdnum;
	private String operatorName;
	private String operatorPasscode;
	private Integer operatorState;
	private Integer operatorPhone;

	// Constructors

	/** default constructor */
	public Toperator() {
	}

	/** minimal constructor */
	public Toperator(String operatorName, String operatorPasscode,
			Integer operatorState) {
		this.operatorName = operatorName;
		this.operatorPasscode = operatorPasscode;
		this.operatorState = operatorState;
	}

	/** full constructor */
	public Toperator(String operatorName, String operatorPasscode,
			Integer operatorState, Integer operatorPhone) {
		this.operatorName = operatorName;
		this.operatorPasscode = operatorPasscode;
		this.operatorState = operatorState;
		this.operatorPhone = operatorPhone;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "OPERATOR_IDNUM", unique = true, nullable = false)
	public Integer getOperatorIdnum() {
		return this.operatorIdnum;
	}

	public void setOperatorIdnum(Integer operatorIdnum) {
		this.operatorIdnum = operatorIdnum;
	}

	@Column(name = "OPERATOR_NAME", nullable = false, length = 35)
	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	@Column(name = "OPERATOR_PASSCODE", nullable = false, length = 50)
	public String getOperatorPasscode() {
		return this.operatorPasscode;
	}

	public void setOperatorPasscode(String operatorPasscode) {
		this.operatorPasscode = operatorPasscode;
	}

	@Column(name = "OPERATOR_STATE", nullable = false)
	public Integer getOperatorState() {
		return this.operatorState;
	}

	public void setOperatorState(Integer operatorState) {
		this.operatorState = operatorState;
	}

	@Column(name = "OPERATOR_PHONE")
	public Integer getOperatorPhone() {
		return this.operatorPhone;
	}

	public void setOperatorPhone(Integer operatorPhone) {
		this.operatorPhone = operatorPhone;
	}

}