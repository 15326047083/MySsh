package com.leiyuan.myssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leiyuan.myssh.entity.User;
import com.leiyuan.myssh.repository.UserRepository;
import com.leiyuan.myssh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 跳转至登录界面
	 * 
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	/**
	 * 登录方法 后续加入权限框架
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(User user) {
		System.out.println(user.toString());
		return "";
	}

	/**
	 * 跳转至注册页面
	 * 
	 * @return
	 */
	@RequestMapping("/toNewUser")
	public String toNewUser() {
		return "new";
	}

	/**
	 * 注册方法
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
	public String newUser(User user) {
		userService.saveOrUpdate(user);
		return "new";
	}
}
