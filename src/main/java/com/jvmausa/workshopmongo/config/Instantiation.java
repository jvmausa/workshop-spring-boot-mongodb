package com.jvmausa.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.jvmausa.workshopmongo.domain.User;
import com.jvmausa.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();

		User maria = new User(null, "Maria Brown", "maria.brown@gmail.com");
		User alex = new User(null, "Alex Green", "alex.green@gmail.com");
		User bob = new User(null, "Bob Grey", "bob.grey@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
