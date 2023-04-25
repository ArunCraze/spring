package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(DemoApplication.class, args);

Student st=new Student(001,"Aniked",21);
  ObjectMapper obj = new ObjectMapper();
  String str=obj.writeValueAsString(st);
  System.out.println(str);

	}

}
