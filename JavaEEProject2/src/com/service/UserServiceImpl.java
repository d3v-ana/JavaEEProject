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
//����һ����¼
		String insertSql = "insert into user(username,password) values(?,?)";
		Object param[] = { "Alice", "123456" };
		userDao.insertUser(insertSql, param);
//����һ����¼
		String updateSql = "update user set password=? where username=?";
		Object param1[] = { "888888", "bb" };
		userDao.updateUser(updateSql, param1);
//��ѯ�û�
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
//�������������ظ������ݣ��������Ƿ���Ч
			userDao.insertUser(insertSql, param);
			userDao.insertUser(insertSql, param);
		} catch (Exception e) {
			System.out.println("�����ظ�������ع���");
//�������������ǲ���ع��ģ���ΪSpringֻ�ڷ���δ�������RuntimeExceptionʱ�Żع�����
			throw new RuntimeException();
		}
	}
}
