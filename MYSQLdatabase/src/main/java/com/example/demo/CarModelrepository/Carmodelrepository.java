package com.example.demo.CarModelrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Database.Model.Carmodel;
@Repository
public interface Carmodelrepository extends JpaRepository<Carmodel, Integer> {

}
