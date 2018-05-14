package com.leiyuan.myssh.util;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.leiyuan.myssh.service.UserService;

public class CustomRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		String userName=(String)arg0.getPrimaryPrincipal();
		
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		// TODO Auto-generated method stub
		// 从页面获取用户名;
		String username = (String) arg0.getPrincipal();
		// 通过用户名获取凭证；
		String password = getPasswordByUserName(username);
		if (password == null)
			return null;
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, password, "customRealm");
		return authenticationInfo;
	}

	private String getPasswordByUserName(String username) {
		// TODO Auto-generated method stub
		return userService.getByEmail(username).getPassword();
	}
}
