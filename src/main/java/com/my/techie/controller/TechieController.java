package com.my.techie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechieController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Thechie......from github!";
	}

}
