package com.my.techie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.techie.model.User;
import com.my.techie.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		userRepository.save(user);
		return "Sucessfully user data is saved...!";
		
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

}
