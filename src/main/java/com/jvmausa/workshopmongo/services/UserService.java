package com.jvmausa.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvmausa.workshopmongo.domain.User;
import com.jvmausa.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired //injeção de dependencia automatica
	UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();

	}

}
