package com.rs.fer.boot.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "UserInfo")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(nullable = false)
	@GeneratedValue
	private int id; 
	@Column
	private String lineOne;
	@Column
	private String lineTwo;
	@Column
	private String street;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int pincode;
	@Column
	private String country;
	@Column
	private int userid;

	public Address() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLineOne() {
		return lineOne;
	}

	public void setLine_1(String lineOne) {
		this.lineOne = lineOne;
	}

	public String getlineTwo() {
		return lineTwo;
	}

	public void setLine_2(String lineTwo) {
		this.lineTwo = lineTwo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

}
