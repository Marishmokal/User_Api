package com.prowings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.UserDao;
import com.prowings.model.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public User createUser(User user) {
		
		return dao.save(user);
	}

}
