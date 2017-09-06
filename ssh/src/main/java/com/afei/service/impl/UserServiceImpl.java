package com.afei.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afei.dao.UserDaoI;
import com.afei.model.User;
import com.afei.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserDaoI userDao;
	
	public void test() {
	
		System.out.println("Hello, World");
	}

	public Serializable save(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

}
