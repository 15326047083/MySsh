package com.leiyuan.myssh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leiyuan.myssh.entity.User;
import com.leiyuan.myssh.repository.UserRepository;
import com.leiyuan.myssh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository<User> userRepository;

	@Override
	public void saveOrUpdate(User user) {
		// TODO Auto-generated method stub
		userRepository.saveOrUpdate(user);
	}

	@Override
	public String save(User t) {
		// TODO Auto-generated method stub
		return userRepository.save(t);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		userRepository.delete(id);
	}

	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return userRepository.get(id);
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return userRepository.queryAll();
	}

	@Override
	public List<User> pagingQuery(int pages) {
		// TODO Auto-generated method stub
		return userRepository.pagingQuery(pages);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userRepository.count();
	}

	@Override
	public List<User> queryAll(String sql) {
		// TODO Auto-generated method stub
		return userRepository.queryAll(sql);
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		String sql = "where email='" + email + "'";
		return userRepository.getByConditions(sql);
	}

}
