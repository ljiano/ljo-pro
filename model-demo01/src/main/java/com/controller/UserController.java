package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.IUserService;

@Controller("user")
public class UserController {
	
	@Autowired
	private IUserService userService;
}
