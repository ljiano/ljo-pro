package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDao userDao;
}
