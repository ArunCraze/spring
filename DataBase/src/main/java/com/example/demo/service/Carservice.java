package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Carmodel;
import com.example.demo.Model.UserCheck;
import com.example.demo.repository.Carrepo;
import com.example.demo.repository.UserRep;
@Service
public class Carservice {
@Autowired
	public Carrepo repo;

@Autowired
    public UserRep rep;

public Carmodel savedetails(Carmodel ca) {
	return repo.save(ca);
}

public void deletedetails(int id) {
	repo.deleteById(id);
	
}

public List<Carmodel> getalldetails() {
	return repo.findAll();
}

public Carmodel updatedet(Carmodel ca) {
	return repo.saveAndFlush(ca);
	
}

public List<Carmodel> sorting(String name) {
	return repo.findAll(Sort.by(name).descending());
}

public List<Carmodel> pagination(int num, int size) {
	
	 Page<Carmodel> p=repo.findAll(PageRequest.of(num, size));
     return p.getContent();
}

public List<Carmodel> pagesorting(int num, int size, String name) {
	
	Page<Carmodel> p=repo.findAll(PageRequest.of(num, size, Sort.by(name).descending()));
	return p.getContent();
}

public String loginCheckData(String username,String password)
{
	Carmodel user = repo.findByusername(username);
	if(user == null)
	{
		return "No User Found/nPlease Try Again!!!!";
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

public UserCheck post(UserCheck uc) {
	return rep.save(uc);
}
}
