package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.UserCheck;
import com.example.demo.repository.UserRep;


@Service
public class UserService 
{
	@Autowired
	public UserRep rep;
	public String loginCheckData(String username,String password)
	{
		UserCheck user = rep.findByusername(username);
		if(user == null)
		{
			return "No User Found Please Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}

	public UserCheck post(UserCheck uc)
	{
		return rep.save(uc);
	}
	public List<UserCheck>getuser()
	{
		return rep.findAll();	
	}
}