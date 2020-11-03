package com.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.MyUser;

@Repository("userDao")
@Mapper
public interface UserDao
{
	public MyUser selectUserById(Integer userid);
	public List<MyUser> selectAllUser();
	public int addUser(MyUser user);
	public int updateUser(MyUser user);
	public int deleteUser(Integer userid);


}
