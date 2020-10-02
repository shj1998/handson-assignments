package com.hsbc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.beans.Contacts;
import com.hsbc.model.beans.User;
import com.hsbc.model.util.DBUtility;

public class UserDaoImpl implements UserDao{

	List<User> list = new ArrayList<User>();
	
	@Override
	public User authenticate(int userId, String password) throws AuthenticationException {
		User user = null;
		try {
			Connection connection = DBUtility.getConnection();
			String loginQuery = "select * from people where userid = ? and password = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
			preparedStatement.setInt(1, userId);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				user = new User();
				user.setUserId(resultSet.getInt("userid"));
				user.setUserName(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
				user.setPhoneNumber(resultSet.getLong("phone"));
				user.setDOB(resultSet.getString("dob"));
				return user;
			}
			resultSet.close();
			preparedStatement.close();
			connection.close();
			if(user == null) {
				throw new AuthenticationException("Sorry something went wrong");
			} 
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}
	@Override
	public User store(User user) {
		try {
			Connection connection=DBUtility.getConnection();
			PreparedStatement sequenceStatement = connection.prepareStatement("values(next value for profile_seq)");
			ResultSet rs = sequenceStatement.executeQuery();
			int seq = 0;
			if(rs.next()) {
				seq = rs.getInt(1);
			} 
			PreparedStatement insertStatement=connection.prepareStatement("insert into people values(?,?,?,?,?)");
			insertStatement.setInt(1,seq);//In first question mark insert userId
			insertStatement.setString(2,user.getUserName());
			insertStatement.setString(3,user.getPassword());
			insertStatement.setLong(4,user.getPhoneNumber());
			insertStatement.setString(5, user.getDOB());
			int resultSet=insertStatement.executeUpdate();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return user;
	}
	
	@Override
	public List<Contacts> viewContacts() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User updateContact(int userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User editProfile(User user, String password, long contact) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User addContacts(User user, String name, long phone) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User fetchAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
