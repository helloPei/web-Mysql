package com.demo.dao;

import com.demo.entity.User;

public interface UserDao {
	public User findAllById(int id);
}