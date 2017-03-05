package com.library.entity;
// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tshubook entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tshubook", catalog = "libary")
public class Tshubook implements java.io.Serializable {

	// Fields

	private Integer bookkkId;
	private String bookkkName;
	private Integer bookkkType;
	private String bookkkPublisherName;
	private String bookkkAuthorName;
	private Integer bookkkPric;
	private Integer bookkkState;
	private Timestamp bookkkStorageTime;
	private String bookkkStorageLocation;
	private String bookkkMakerrr;

	// Constructors

	/** default constructor */
	public Tshubook() {
	}

	/** minimal constructor */
	public Tshubook(String bookkkName, Integer bookkkType, Integer bookkkState,
			String bookkkMakerrr) {
		this.bookkkName = bookkkName;
		this.bookkkType = bookkkType;
		this.bookkkState = bookkkState;
		this.bookkkMakerrr = bookkkMakerrr;
	}

	/** full constructor */
	public Tshubook(String bookkkName, Integer bookkkType,
			String bookkkPublisherName, String bookkkAuthorName,
			Integer bookkkPric, Integer bookkkState,
			Timestamp bookkkStorageTime, String bookkkStorageLocation,
			String bookkkMakerrr) {
		this.bookkkName = bookkkName;
		this.bookkkType = bookkkType;
		this.bookkkPublisherName = bookkkPublisherName;
		this.bookkkAuthorName = bookkkAuthorName;
		this.bookkkPric = bookkkPric;
		this.bookkkState = bookkkState;
		this.bookkkStorageTime = bookkkStorageTime;
		this.bookkkStorageLocation = bookkkStorageLocation;
		this.bookkkMakerrr = bookkkMakerrr;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "BOOKKK_ID", unique = true, nullable = false)
	public Integer getBookkkId() {
		return this.bookkkId;
	}

	public void setBookkkId(Integer bookkkId) {
		this.bookkkId = bookkkId;
	}

	@Column(name = "BOOKKK_NAME", nullable = false)
	public String getBookkkName() {
		return this.bookkkName;
	}

	public void setBookkkName(String bookkkName) {
		this.bookkkName = bookkkName;
	}

	@Column(name = "BOOKKK_TYPE", nullable = false)
	public Integer getBookkkType() {
		return this.bookkkType;
	}

	public void setBookkkType(Integer bookkkType) {
		this.bookkkType = bookkkType;
	}

	@Column(name = "BOOKKK_PUBLISHER_NAME")
	public String getBookkkPublisherName() {
		return this.bookkkPublisherName;
	}

	public void setBookkkPublisherName(String bookkkPublisherName) {
		this.bookkkPublisherName = bookkkPublisherName;
	}

	@Column(name = "BOOKKK_AUTHOR_NAME")
	public String getBookkkAuthorName() {
		return this.bookkkAuthorName;
	}

	public void setBookkkAuthorName(String bookkkAuthorName) {
		this.bookkkAuthorName = bookkkAuthorName;
	}

	@Column(name = "BOOKKK_PRIC")
	public Integer getBookkkPric() {
		return this.bookkkPric;
	}

	public void setBookkkPric(Integer bookkkPric) {
		this.bookkkPric = bookkkPric;
	}

	@Column(name = "BOOKKK_STATE", nullable = false)
	public Integer getBookkkState() {
		return this.bookkkState;
	}

	public void setBookkkState(Integer bookkkState) {
		this.bookkkState = bookkkState;
	}

	@Column(name = "BOOKKK_STORAGE_TIME", length = 19)
	public Timestamp getBookkkStorageTime() {
		return this.bookkkStorageTime;
	}

	public void setBookkkStorageTime(Timestamp bookkkStorageTime) {
		this.bookkkStorageTime = bookkkStorageTime;
	}

	@Column(name = "BOOKKK_STORAGE_LOCATION")
	public String getBookkkStorageLocation() {
		return this.bookkkStorageLocation;
	}

	public void setBookkkStorageLocation(String bookkkStorageLocation) {
		this.bookkkStorageLocation = bookkkStorageLocation;
	}

	@Column(name = "BOOKKK_MAKERRR", nullable = false)
	public String getBookkkMakerrr() {
		return this.bookkkMakerrr;
	}

	public void setBookkkMakerrr(String bookkkMakerrr) {
		this.bookkkMakerrr = bookkkMakerrr;
	}

}