package com.demo.dao;

import com.demo.entity.User;

public interface UserDao {
	
	User findAllById(int id);
	
	int selectCount();
	
}