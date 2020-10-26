package org.model;

public class User {
	private Integer userid; // 用户id
	private String username; // 用户名
	private String password; // 密码
//属性userid的 get/set 方法

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

//属性username的 get/set 方法
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

//属性password的 get/set 方法
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}