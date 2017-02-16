package com.springtutorial.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.springtutorial.dao.UserDao;
import com.springtutorial.model.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao{

	@Override
	public User findBySso(String sso) {
		Criteria criteria = this.creatteEntittyCriteia();
		criteria.add(Restrictions.eq("ssoId", sso));
		return (User)criteria.uniqueResult();
	}
	
}
