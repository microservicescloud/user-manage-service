package com.cs.ums.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot live hot swapping";
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

}