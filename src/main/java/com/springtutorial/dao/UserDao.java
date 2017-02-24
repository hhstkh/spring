package com.springtutorial.dao;

import com.springtutorial.entity.User;

public interface UserDao extends GenericDao<User, Integer>{

	User findBySso(String sso);

}
