package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.exception.UserNotFoundException;
import com.hsbc.model.beans.User;

public interface UserService {
	public User login(int userId, String password) throws AuthenticationException;
	public User createUser(User user);
	public User editProfile(int userId, String password,long phone);
	//public User getContact(int userId)throws UserNotFoundException ;
	public List<User> fetchAllUsers();
	
}
