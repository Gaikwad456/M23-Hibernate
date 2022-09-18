package com.capgemini.services;


import com.capgemini.dao.UserDao;
import com.capgemini.dao.UserDaoImpl;
import com.capgemini.entities.User;

public class UserServiceImpl implements UserService 
{

private UserDao dao;
	
	public UserServiceImpl() {
		super();
		dao=new UserDaoImpl();
	}
	@Override
	public User addNewUser(User user) {
		dao.beginTransaction();
		dao.addNewUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User deleteUser(int Userid) {
		User user=dao.deleteUser(Userid);
		return user;
	}

}
