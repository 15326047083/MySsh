package com.leiyuan.myssh.repository.impl;

import org.springframework.stereotype.Repository;

import com.leiyuan.myssh.entity.User;
import com.leiyuan.myssh.repository.UserRepository;

@Repository
public class UserRepositoryImpl extends CommonRepositoryImpl<User> implements UserRepository<User> {

}
