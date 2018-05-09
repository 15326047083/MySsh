package com.leiyuan.myssh.service;

import com.leiyuan.myssh.entity.User;

public interface UserService{
	User get(Long id);
	User getByEmail(String email);
}
