package com.springtutorial.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springtutorial.dao.GenericDao;
import com.springtutorial.dao.UserDao;
import com.springtutorial.model.User;
import com.springtutorial.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
	private UserDao userDao;
	
	@Autowired
	public UserServiceImpl(@Qualifier("userDaoImpl") GenericDao<User, Integer> genericDao) {
		this.userDao = (UserDao)genericDao;
	}

	@Override
	public User findBySso(String sso) {
		return this.userDao.findBySso(sso);
	}
}
