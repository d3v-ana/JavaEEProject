package com.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.UserDao;
import com.entity.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void test1() {
//插入一条记录
		String insertSql = "insert into user(username,password) values(?,?)";
		Object param[] = { "Alice", "123456" };
		userDao.insertUser(insertSql, param);
//更新一条记录
		String updateSql = "update user set password=? where username=?";
		Object param1[] = { "888888", "bb" };
		userDao.updateUser(updateSql, param1);
//查询用户
		String selectSql = "select * from user";
		List<User> list = userDao.query(selectSql, null);
		for (User u : list) {
			System.out.println(u.getUserid() + " " + u.getUsername() + " " + u.getPassword());
		}
	}

	@Override
	public void test2() {
		String deleteSql = "delete from user";
		String insertSql = "insert into user values(?,?,?)";
		Object param[] = { 1, "John", "123456" };
		try {
			userDao.deleteUser(deleteSql, null);
//插入两条主键重复的数据，看事务是否生效
			userDao.insertUser(insertSql, param);
			userDao.insertUser(insertSql, param);
		} catch (Exception e) {
			System.out.println("主键重复，事务回滚！");
//不加这条事务是不会回滚的，因为Spring只在发生未被捕获的RuntimeException时才回滚事务
			throw new RuntimeException();
		}
	}
}
