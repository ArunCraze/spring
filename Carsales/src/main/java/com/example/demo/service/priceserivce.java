package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.carprice;
import com.example.demo.repository.pricerepo;
@Service
public class priceserivce {
	@Autowired
	pricerepo arep;
	
	public carprice saveDetails(carprice as)
	{
		return arep.save(as);
	}
	
	public List<carprice> getDetails()
	{
		return arep.findAll();
	}
	
	public carprice updateDetails(carprice aup)
	{
		return arep.saveAndFlush(aup);
	}
	
	public void deleteDetails(int id)
	{
		arep.deleteById(id);
	}
	
	public List<carprice> getAllData()
	{
		return arep.getAllData();
	}
	
	public List<carprice> getbyid(int id)
	{
		return arep.bybid(id);
	}
	
	
	public List<carprice> between(int start,int end)
	{
		return arep.startend(start,end);
	}
	
	public void deletebyidname(int id,String name)
	{
		arep.deletebyId(id, name);
	}
	
	public void updatebyidname(int id,String name)
	{
		 arep.updatebyidname(id,name);
	}


}
