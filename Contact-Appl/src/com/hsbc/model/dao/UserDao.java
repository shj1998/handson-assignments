package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.Contacts;
import com.hsbc.model.beans.User;

public interface UserDao {

	public User authenticate(int userId, String password) throws AuthenticationException;
	public User store(User user);
	public User editProfile(User user,String password,long contact);
	public User addContacts(User user,String name, long phone);
	public List<Contacts> viewContacts();
	public User updateContact(int userId, User user);
	public User fetchAllUsers();
}
