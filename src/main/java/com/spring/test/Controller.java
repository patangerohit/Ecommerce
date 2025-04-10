package com.spring.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom")
public class Controller {

	@GetMapping("/greet")
	public String greet() {
		return "Hello !";
	}
}
