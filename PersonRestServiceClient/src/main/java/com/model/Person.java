package com.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.mongodb.core.mapping.Document;

@XmlRootElement
@Document
public class Person {
	private int id;
	private String name;
	private int age;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String fName) {
		this.name = fName;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(int id, String name, int age, String email){
		this.setId(id);
		this.setName(name);
		this.setAge(age);
		this.setEmail(email);
	}
	
	public Person(){
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
