package com.hsbc.model.service;

import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.User;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.util.UserFactory;

public class UserServiceImpl implements UserService{

	private UserDao userDao = null;
	public UserServiceImpl() {
		userDao = (UserDao)UserFactory.getInstance("dao");
	}
	@Override
	public User login(int userId, String password) throws AuthenticationException {
		User user = userDao.authenticate(userId, password);
		if(user == null) {
			throw new AuthenticationException("Sorry something went wrong");
		}
		return user;
	}

	@Override
	public User createUser(User user) {
		User userRegistered=userDao.store(user);
		return userRegistered;
	}

	@Override
	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User editProfile(int userId, String password, long phone) {
		User foundUser=null;
		List<User> allUsers=userDao.fetchAllUsers();
		for(User user :allUsers) {
			if(user.getUserId()==userId) {
				foundUser=user;
				break;
			}
		}
		foundUser.setPhoneNumber(phone);
		User updateUser=userDao.updateUser(userId,foundUser);
		return updateUser;
	}

}
