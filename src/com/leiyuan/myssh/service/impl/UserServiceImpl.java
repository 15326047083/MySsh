package com.leiyuan.myssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leiyuan.myssh.entity.User;
import com.leiyuan.myssh.repository.UserRepository;
import com.leiyuan.myssh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
	private UserRepository userRepository;
	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return userRepository.get(id);
	}
	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.getByEmail(email);
	}

}
