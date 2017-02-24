package com.springtutorial.service;

import com.springtutorial.entity.User;

public interface UserService extends GenericService<User, Integer> {
	User findBySso(String sso);
}
