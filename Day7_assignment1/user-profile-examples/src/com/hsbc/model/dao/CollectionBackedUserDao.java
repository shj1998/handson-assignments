package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.User;

public class CollectionBackedUserDao implements UserDao{

	ArrayList<User> list = new ArrayList<User>();

	@Override
	public User store(User user) {
		list.add(user);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		
		User[] user_array = list.toArray(new User[list.size()]);
		return user_array;
	}

	@Override
	public User fetchUserById(int userId) {
		User user = null;
		for(User temp : list) {
			if(temp.getUserId() == userId) {
				user = temp;
				return user;
			}
		}
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		
		for(User temp : list) {
			if(temp.getUserId() == userId) {
				temp = user;
				return user;
			}
		}
		return null;
	}
}
