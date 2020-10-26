package org.db;

import java.sql.*;

public class DBConn {
	public static Connection conn;// Connection对象（连接）
// 获取数据库连接

	public static Connection getConn() {
		try {
// 加载驱动程序
			Class.forName("com.mysql.jdbc.Driver").newInstance();
// 建立连接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&useUnicode=true&characterEncoding=UTF-8", "root", "123456");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

// 关闭连接
	public static void closeConn() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
