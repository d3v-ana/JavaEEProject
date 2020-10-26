package org.dao;

import java.sql.*;
import org.db.DBConn;
import org.model.User;

public class UserDao {
	Connection conn;

//检查用户
	public User checkUser(String userName, String password) {
		try {
			conn = DBConn.getConn();
			PreparedStatement pstmt = conn.prepareStatement("select * from user where username=? and password=?");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPassword(rs.getString(3));
				return user;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			DBConn.closeConn();
		}
	}
}