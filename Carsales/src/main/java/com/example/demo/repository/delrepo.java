package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.cardel;

import jakarta.transaction.Transactional;

public interface delrepo extends JpaRepository<cardel, Integer> {
public List<cardel> findBymodel(String model);
	
	@Query(value = "select * from cardel",nativeQuery = true)
	public List<cardel> getAllData();
	
	@Query(value = "select * from cardel where id=:id",nativeQuery = true)
	public List<cardel> bycid(@Param("id") int id);
	
	@Query(value="select * from cardel where id between :start and :end",nativeQuery=true)
	public List<cardel> startend(@Param("start") int start,@Param("end") int end);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update cardel set model=:name where id=:id",nativeQuery = true)
	public void updatebyidname(@Param("name") String name,@Param("id") int id);
	
	

//JPQL

	@Query("select s from cardel s where s.model=?1")
	public List<cardel> getbyjc(String cname);
	
	@Query("select s from cardel s where s.id between ?1 and ?2")
	public List<cardel> betweenjc(int start,int end);
	
	@Query(value="select s from cardel s where s.model like 'B%'")
	public List<cardel> likejc();
	
	@Modifying
	@Transactional
	@Query(value="update cardel s set s.model=?1 where s.id=?2")
	public void updatejc(String cname,int id);
}
	