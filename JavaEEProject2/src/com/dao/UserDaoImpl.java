package com.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insertUser(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}

	@Override
	public int updateUser(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}

	@Override
	public int deleteUser(String sql, Object[] param) {
		return jdbcTemplate.update(sql, param);
	}

	@Override
	public List<User> query(String sql, Object[] param) {
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return jdbcTemplate.query(sql, rowMapper, param);
	}
}