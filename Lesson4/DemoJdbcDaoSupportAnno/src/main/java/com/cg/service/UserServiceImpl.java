package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.User;
import com.cg.dao.UserDaoIntf;

@Service("userService")
public class UserServiceImpl implements UserServiceIntf {
	@Autowired
	UserDaoIntf userDao;
	@Override
	public List<User> displayUsers() {
		return userDao.displayUsers();
	}

}
