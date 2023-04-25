package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Carmodel;

public interface Carrepo extends JpaRepository<Carmodel, Integer> {

}
