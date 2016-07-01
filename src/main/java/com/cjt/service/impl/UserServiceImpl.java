package com.cjt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjt.dao.IUserDao;
import com.cjt.domain.User;
import com.cjt.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl");
	}
	
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

}
