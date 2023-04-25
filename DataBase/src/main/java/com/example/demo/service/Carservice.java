package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Carmodel;
import com.example.demo.repository.Carrepo;
@Service
public class Carservice {
@Autowired
	public Carrepo repo;

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
}
