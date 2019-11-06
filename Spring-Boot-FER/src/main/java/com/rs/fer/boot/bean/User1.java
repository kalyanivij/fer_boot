package com.rs.fer.boot.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="UserInfo")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

	@Id
	@Column(nullable=false)
	@GeneratedValue
	private int id;
	@Column
	private String first_name;
	@Column
	private String middle_name;
	@Column
	private String last_name;
	@Column
	private String email;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String mobile_number;
	
	
	  @OneToMany(fetch=FetchType.LAZY, targetEntity=Expense.class,
	  cascade=CascadeType.ALL)
	  
	  @JoinColumn(name="userid", referencedColumnName="id") private Set<Expense>
	  expenses;
	  
	  @OneToOne(targetEntity=Address.class, cascade=CascadeType.ALL)
	  
	  @JoinColumn(name="userid", referencedColumnName="id")
	  
	  private Address address;
	 
	public User() {
	}

	public User(String first_name, String middle_name, String last_name, String email, String username, String password,
			String mobile_number) {
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.email = email;
		this.username = username;
		this.password = password;
		this.mobile_number = mobile_number;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return this.middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile_number() {
		return this.mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	
	  public Set<Expense> getExpenses() { return this.expenses; } public void
	  setExpenses(Set<Expense> expenses) { this.expenses=expenses; }
	  
	  
	  public Address getAddress() { return this.address; }
	  
	  public void setAddress(Address address) { this.address = address; }
	 
	public String toString() {
		return "User [first_name=" + first_name + ", id=" + id + ", middle_name=" + middle_name + " ,last_name="
				+ last_name + " ,email=" + email + " ,username=" + username + " ,password=" + password
				+ " ,mobile_number=" + mobile_number + "]";
		
	}
}