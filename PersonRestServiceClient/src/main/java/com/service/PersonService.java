package com.service;

import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Person;
import com.repository.PersonRepository;

@Service
public class PersonService {
	
	PersonRepository  pr;
	
	Hashtable<Integer,Person> persons = new Hashtable<Integer,Person>(); 
	public PersonService(){
//		Person person1 = new Person(1, "Thameem", "Ansur", 28,"ansur985@gmail.com");
//		Person person2 = new Person(2, "Raham", "Shaik",20, "ansur304@gmail.com");
//		persons.put(person1.getId(), person1);
//		persons.put(person2.getId(), person2);		
	}

	
	public Person getPerson(int id){
		return pr.getPerById(id);
	}
	
	public List<Person> getPersons(){
		return pr.findAll();
	}
	
	public Person getByName(String name){
		return pr.getPerByName(name);
	}
	
	public Person createPerson(Person person){
		return pr.save(person);
	}
	
	public void deleteAll(){
		pr.deleteAll();
	}
	
	public void deleteByName(String name){
		pr.delete(name);
	}
}

