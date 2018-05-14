package com.leiyuan.myssh.service;

import java.util.List;

import com.leiyuan.myssh.entity.UserRoles;

public interface UserRolesService {

	void saveOrUpdate(UserRoles roles);

	List<String> getRolesByEmail(String email);
}
