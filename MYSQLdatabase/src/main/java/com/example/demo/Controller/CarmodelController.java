package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Database.Model.Carmodel;
import com.example.demo.Service.Carmodel.Servicecarmodel;

@RestController
public class CarmodelController {
	@Autowired
	public Servicecarmodel iser;
	@PostMapping("/saveCarmodel")
    public Carmodel addDetails( @RequestBody Carmodel ia)
    {
    	return iser.saveInfo(ia);
    }
}
