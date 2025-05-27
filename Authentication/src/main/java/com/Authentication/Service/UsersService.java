package com.Authentication.Service;

import com.Authentication.entities.Users;

public interface UsersService {
	void signUp(Users user);

	boolean usernameExist(String username);

	Users getUser(String username);
}
