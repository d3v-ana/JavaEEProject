package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.controller.UserController;

public class Test {
	public static void main(String args[]) {
//��ʼ��Spring����ApplicationContext�����������ļ�
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//ͨ��������ȡuserControllerʵ��
		UserController userController = (UserController) appCon.getBean("userController");
		userController.test();
	}
}