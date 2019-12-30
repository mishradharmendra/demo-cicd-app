package com.dharam.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoCicdAppApplication {

	@GetMapping("/")
	public String home() {
		return "Hello World from Dharmendra";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoCicdAppApplication.class, args);
	}

}
