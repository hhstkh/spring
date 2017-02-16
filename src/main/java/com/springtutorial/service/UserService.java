package com.springtutorial.service;

import com.springtutorial.model.User;

public interface UserService extends GenericService<User, Integer> {
	User findBySso(String sso);
}
