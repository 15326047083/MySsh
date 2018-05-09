package com.leiyuan.myssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leiyuan.myssh.entity.User;
import com.leiyuan.myssh.service.PersonService;
import com.leiyuan.myssh.service.UserService;

/**
 * Created by XRom On 11/16/2017.11:59 PM
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired(required = true)
	private PersonService personService;

	@Autowired(required = true)
	private UserService userService;

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test() {
		return "test";
	}

	@RequestMapping(value = "/savePerson", method = RequestMethod.GET)
	public String savePerson() {
		System.out.println(personService.get(personService.savePerson()));
		return "test";
	}
	
	@RequestMapping(value="/Login",method= RequestMethod.POST)
	public String Login(User user) {
		User u=new User();
		u=userService.getByEmail(user.getEmail());
		if(u!=null) {
			System.out.println(u);
			if(u.getPassword().equals(user.getPassword())) {
				return "test";
			}else {
				return "login";
			}
		}else {
			return "login";
		}
	}
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}
}
