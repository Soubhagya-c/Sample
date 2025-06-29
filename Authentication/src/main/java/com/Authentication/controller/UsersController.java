package com.Authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Authentication.Service.UsersService;
import com.Authentication.entities.UserLoginData;
import com.Authentication.entities.Users;

@Controller
public class UsersController {

	@Autowired
	UsersService service;
	
	@GetMapping("/open_signUp")
	public String open_signUp()
	{
		return "sign_up";
	}
	
	@GetMapping("/open_signIn")
	public String open_signIn()
	{
		return "sign_in";
	}
	@PostMapping("/signUp")
	public String signUp(@ModelAttribute Users user)
	{
		String username = user.getUsername();
		boolean usernameExist = service.usernameExist(username);
		if(usernameExist == false)
			service.signUp(user);
		else
			System.out.println("User already exists!");
		return "index";
	}
	@PostMapping("/signIn")
	public String signIn(@ModelAttribute UserLoginData data)
	{
		Users dbuser = service.getUser(data.getUsername());
		if(dbuser != null)
		{
			if(data.getPassword().equals(dbuser.getPassword()))
				return "success";
		}
		return "fail";
	}
}
