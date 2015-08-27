package com.sweet.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sweet.dao.UsersDAO;


//@Service("userService")
public class UserService {
//	@Resource
	private UsersDAO userDao;
	
//	@Transactional
	public int userCount(){
		return userDao.getAllUser().size();
	}

	public UsersDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UsersDAO userDao) {
		this.userDao = userDao;
	}

}
