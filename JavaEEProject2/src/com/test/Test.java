package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.controller.UserController;

public class Test {
	public static void main(String args[]) {
//初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//通过容器获取userController实例
		UserController userController = (UserController) appCon.getBean("userController");
		userController.test();
	}
}