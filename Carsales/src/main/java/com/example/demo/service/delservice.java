package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.cardel;
import com.example.demo.repository.delrepo;
@Service

public class delservice {

		@Autowired
		delrepo crep;
		
		public cardel saveDetails(cardel cs)
		{
			return crep.save(cs);
		}
		
		public List<cardel> getDetails()
		{
			return crep.findAll();
		}
		
		public cardel updateDetails(cardel cup)
		{
			return crep.saveAndFlush(cup);
		}
		
		public List<cardel> getAllData()
		{
			return crep.getAllData();
		}
		
		public List<cardel> getbyid(int id)
		{
			return crep.bycid(id);
		}
		
		
		public List<cardel> between(int start,int end)
		{
			return crep.startend(start,end);
		}
		
		public void updatebyidname(String name,int id)
		{
			 crep.updatebyidname(name,id);
		}

}
