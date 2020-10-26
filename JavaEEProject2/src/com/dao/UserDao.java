package com.dao;

import java.util.List;
import com.entity.User;

public interface UserDao {
	public int insertUser(String sql, Object[] param);

	public int updateUser(String sql, Object[] param);

	public int deleteUser(String sql, Object[] param);

	public List<User> query(String sql, Object[] param);
}
