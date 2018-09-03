package com.crud.model;

import org.springframework.data.annotation.Id;

public class Account {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String firstname;
	
	private String lastname;
	
	private String accountno;
	
	public Account() {}
	
	public Account(String firstname, String lastname, String accountno)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.accountno=accountno;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
}