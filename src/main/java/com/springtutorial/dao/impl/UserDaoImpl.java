package com.springtutorial.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.springtutorial.dao.UserDao;
import com.springtutorial.entity.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao{

	@Override
	public User findByUsername(String sso) {
		Criteria criteria = this.creatteEntittyCriteia();
		criteria.add(Restrictions.eq("username", sso));
		return (User)criteria.uniqueResult();
	}
	
}
