package io.javabrains.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/api/user")
	public String user() {
		
		return "Welcome to the protected user API";
	}
}
