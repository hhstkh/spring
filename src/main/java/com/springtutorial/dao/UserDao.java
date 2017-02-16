package com.springtutorial.dao;

import com.springtutorial.model.User;

public interface UserDao extends GenericDao<User, Integer>{

	User findBySso(String sso);

}
