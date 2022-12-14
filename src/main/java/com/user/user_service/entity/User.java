package com.user.user_service.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class User {

	private Long userId;
	private String name;
	private String phone;
//	@JsonSerialize(as = Contact.class)
	List<Contact> contacts = new ArrayList<>();
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public User(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	
}
