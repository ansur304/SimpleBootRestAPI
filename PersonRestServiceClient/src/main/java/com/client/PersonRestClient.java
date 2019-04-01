package com.client;

import java.util.Calendar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.model.Person;

@Component
public class PersonRestClient implements CommandLineRunner {

	public void callPersonService() {
		RestTemplate template = new RestTemplate();
		Person person = template.getForObject("http://thameem-works-user-display.eu-west-2.elasticbeanstalk.com:8090/persons/1", Person.class);
		System.out.println("Person name is :: " + person.getName());
	}

	@Override
	public void run(String... args) throws Exception {
		//callPersonService();
		System.out.println("Welcome to new App **********************************"+Calendar.getInstance().getTime() );
	}

}
