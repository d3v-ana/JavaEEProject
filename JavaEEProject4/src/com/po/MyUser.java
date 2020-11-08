package com.po;
public class MyUser {
private Integer userid;
private String username;
private String password;
public Integer getUserId() {
return userid;
}
public void setUserId(Integer id) {
this.userid = id;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public String toString() {
return "User [userid="+userid+" username="+username+"password="+password+"]";
}
}