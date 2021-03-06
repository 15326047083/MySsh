package com.leiyuan.myssh.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leiyuan.myssh.entity.UserRoles;
import com.leiyuan.myssh.repository.UserRolesRepository;

@Repository
public class UserRolesRepositoryImpl extends CommonRepositoryImpl<UserRoles> implements UserRolesRepository<UserRoles> {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<String> getRolesByEamil(String email) {
		// TODO Auto-generated method stub
		return (List<String>) getCurrentSession()
				.createQuery("select roles from UserRoles where email='" + email + "'").list();
	}
}
