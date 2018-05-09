package com.leiyuan.myssh.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leiyuan.myssh.entity.User;
import com.leiyuan.myssh.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.openSession();
	}
	
	@Override
	public User load(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(Long id) {
		// TODO Auto-generated method stub
		return (User)getCurrentSession().get(User.class, id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persist(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long save(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return (User)getCurrentSession().createQuery("from User u where u.email='"+email+"'").uniqueResult();
	}

}
