package com.leiyuan.myssh.repository;

import com.leiyuan.myssh.entity.User;

public interface UserRepository extends DomainRepository<User, Long>{

	User getByEmail(String email);
}
