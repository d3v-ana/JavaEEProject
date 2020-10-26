package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.service.UserService;

@Controller("userController")
public class UserController {
	@Autowired
	private UserService userService;

	public void test() {
		userService.test1();
		userService.test2();
	}
}