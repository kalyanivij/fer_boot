package com.rs.fer.boot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="UserInfo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address {

	@Id
	@Column(nullable = false)
	@GeneratedValue
	private int id;
	@Column
	private String line_1;
	@Column
	private String line_2;
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

	public Address(String line_1, String line_2, String street, String city, String state, int pincode, String country,
			int userid) {
		this.line_1 = line_1;
		this.line_2 = line_2;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.userid = userid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLine_1() {
		return line_1;
	}

	public void setLine_1(String line_1) {
		this.line_1 = line_1;
	}

	public String getLine_2() {
		return line_2;
	}

	public void setLine_2(String line_2) {
		this.line_2 = line_2;
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

	 
		public String toString() {
			return "Address [line_1=" + line_1 + ", id=" + id + ", line_2=" + line_2 + " ,street="
					+ street + " ,city=" + city + " ,state=" + state + " ,pincode=" + pincode
					+ " ,country=" + country + " ,userid=" + userid +"]";
}
}
