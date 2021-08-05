package com.googlelogin.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/")
	   public String home() {
		return " Hi This is Google Login Project !!";
	   }
	
	@GetMapping("/prevent")
	   public Principal prevent(Principal principal) {
	      return principal;
	   }
}
