package cn.com.sm.dao;

import cn.com.sm.po.User;

public interface UserDao {
	public User findUserById(int uid) throws Exception;
}
