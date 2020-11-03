package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.dao.UserDao;
import com.po.MyUser;
@Controller("userController")
public class UserController
{
	@Autowired
	private UserDao userDao;
	public void test() 
	{
		//查询一个用户
		MyUser auser = userDao.selectUserById(1);
		System.out.println(auser);
		System.out.println("================");
		//添加一个用户
		MyUser addmu = new MyUser();
		addmu.setUsername("chenghen");
		addmu.setPassword("123456");
		int add = userDao.addUser(addmu);
		System.out.println("添加了" + add + "条记录");
		System.out.println("================");
		//修改一个用户
		MyUser updatemu = new MyUser();
		updatemu.setUserid(11);
		updatemu.setUsername("zhangsan");
		updatemu.setPassword("123456");
		int up = userDao.updateUser(updatemu);
		System.out.println("修改了" + up + "条记录");
		System.out.println( "================");
		//删除一个用户
		int dl = userDao.deleteUser(9);
		System.out.println("删除了" + dl + "条记录");
		System.out.println("================");
		//查询所有用户
		List<MyUser> list = userDao.selectAllUser();
		for (MyUser myUser : list) {
		System.out.println(myUser);
		}

	}

}
