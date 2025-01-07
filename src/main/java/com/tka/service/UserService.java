package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.UserDao;
import com.tka.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public boolean logincheck(User user) {
	  return userDao.logincheck(user);
		
	}
}
