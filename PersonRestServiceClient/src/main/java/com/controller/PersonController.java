package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Person;
import com.service.PersonService;

@Controller
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService ps;

	@RequestMapping(value = "/all", method=RequestMethod.GET)
	public List<Person> getAll() {
		return ps.getPersons();
	}
//
//	@GetMapping("/{id}")
//	public Person getPerson(@RequestParam("id") int id) {
//		return ps.getPerson(id);
//	}

	//@RequestParam("name") String name,@RequestParam("email") String email, @RequestParam("age") String age, @RequestParam("id") String id
	///create/{name}/{email}/{age}/{id}" @PathVariable("email") String email, @PathVariable("age") int age, @PathVariable("id") int id
	@RequestMapping(value = "/create", method=RequestMethod.POST)
	public List<Person> createPerson(@RequestParam("name") String name) {
		if (null != ps.createPerson(new Person(1, name, 27, "testemail"))) {
			return ps.getPersons();
		} else {
			System.out.println("Person Creation failed ..............!");
			return null;
		}
	}
	
	@RequestMapping(value= "/{name}/{email}", method=RequestMethod.GET)
	public Person getPersonByName(@RequestParam("name") String name, @RequestParam("email") String email) {
		return ps.getByName(name);
	}
	
	@RequestMapping("/deleteall")
	public String deleteAll(){
		ps.deleteAll();
		return "Delete All Persons";
	}

}
