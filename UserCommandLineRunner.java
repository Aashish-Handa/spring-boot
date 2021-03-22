package com.practice.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository repo;
	
	private static Logger log=LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new User("Aashish", "Admin"));
		repo.save(new User("Akshay", "User"));
		repo.save(new User("Abhishek", "Admin"));
		
		for(User user:repo.findAll()) {
			log.info(user.toString());
			System.out.println(user.toString());
		}
	}
	
}
