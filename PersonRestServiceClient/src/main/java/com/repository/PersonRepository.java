package com.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{
	
	@Query
	public Person getPerByName(String name);
	
	public List<Person> findAll();
	
	public Person getPerById(int id);

}
