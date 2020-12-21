package com.ribbon.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Autowired
	Environment environment;

	@GetMapping("/")
	public String health() {
		return "I am Ok";
	}

	@GetMapping("/backend")
	public String backend() {
		System.out.println("Inside MyRestController::backend...");

		String serverPort = environment.getProperty("local.server.port");

		System.out.println("Port : " + serverPort);
		
		return "Hello form Backend!!! " + " Host : localhost " + " :: Port : " + serverPort;
	}

	@PostMapping("/backendpost")
	private String saveBook() {
		System.out.println("Inside MyRestController::backendpost...");

		String serverPort = environment.getProperty("local.server.port");

		System.out.println("Port : " + serverPort);		
		
		return "Hello form Backend Post!!! " + " Host : localhost " + " :: Port : " + serverPort;
	
	}


}