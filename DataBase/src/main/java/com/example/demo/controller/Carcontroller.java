package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Carmodel;
import com.example.demo.service.Carservice;
@RestController
public class Carcontroller {
	@Autowired
	public Carservice serve;
	
	@PostMapping("/car")
	public Carmodel savedetails(@RequestBody Carmodel ca)
	{
		return serve.savedetails(ca);
	}
	
	@DeleteMapping("/car/{id}")
	public String deletedetails(@PathVariable("id") int id)
	{
		serve.deletedetails(id);
		return "The Deletion Was Successful";
	}
	
	@GetMapping("/carget")
	public List<Carmodel> getalldetails()
	{
		return serve.getalldetails();
	}
	
	
	@DeleteMapping("/cardel")
	public String deletedetailsreqparam(@RequestParam("id") int id)
	{
		serve.deletedetails(id);
		return "deletion using reqparam was successful";
	}
	@PutMapping("/update")
	public Carmodel updatedet(@RequestBody Carmodel ca)
	{
		return serve.updatedet(ca);
	}

}
