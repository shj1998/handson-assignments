package com.hsbc.model.beans;

public class Contacts extends User{
	private int contactId;
	private String name;
	private long phoneNo;
	private int userId;
	public Contacts(int contactId, String name, long phoneNo, int userId) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.userId = userId;
	}
	
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "contacts [contactId=" + contactId + ", name=" + name + ", phoneNo=" + phoneNo + ", userId=" + userId
				+ "]";
	}
	
	
	
}
