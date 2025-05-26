package com.Authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Authentication.Service.UsersService;
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
		service.signUp(user);
		return "index";
	}
}
