package com.Authentication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Authentication.entities.Users;
import com.Authentication.repository.UserRepository;

@Service
public class UsersServiceImplementation implements UsersService{

	@Autowired
	UserRepository repo;

	public void signUp(Users user)
	{
		repo.save(user);
	}
}
