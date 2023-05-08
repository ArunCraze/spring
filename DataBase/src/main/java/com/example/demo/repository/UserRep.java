package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.UserCheck;

public interface UserRep extends JpaRepository<UserCheck, Integer> 
{
	UserCheck findByusername(String username);

}
