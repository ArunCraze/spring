package com.example.demo.Service.Carmodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CarModelrepository.Carmodelrepository;
import com.example.demo.Database.Model.Carmodel;

@Service
public class Servicecarmodel {
	@Autowired
    public Carmodelrepository irepo;
	public Carmodel saveInfo(Carmodel im)
	{
		return  irepo.save(im);
	}
}
