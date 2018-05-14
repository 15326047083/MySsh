package com.leiyuan.myssh.repository;

import java.util.List;

public interface UserRolesRepository<UserRoles> extends CommonRepository<UserRoles> {
	List<String> getRolesByEamil(String email);
}
