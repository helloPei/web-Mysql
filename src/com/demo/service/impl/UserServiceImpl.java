package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import com.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDao userDao;//持有一个持久层对象
	
    public User findAllById(int id) {
        return userDao.findAllById(id);
    }
}