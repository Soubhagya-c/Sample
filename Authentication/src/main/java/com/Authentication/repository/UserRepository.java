package com.Authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Authentication.entities.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{

}
