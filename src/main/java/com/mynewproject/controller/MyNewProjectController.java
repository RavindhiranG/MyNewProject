package com.mynewproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyNewProjectController {

	@GetMapping (value = "/mynewproject")
	public String mynewproject() {
		return "My new project";
	}
}
